/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author manon
 */
public class Guerrier extends Personnage {
    boolean cheval ;
    String verif;
    ArrayList <Arme> tabArmes= new ArrayList<Arme>();
    Arme armeMain;
    int nbGuer;
   
    public Guerrier(String Nom, int NiveauVie, boolean Ch) {
        super(Nom, NiveauVie);
        cheval=Ch;
        armeMain=null;
        nbGuer+=1;
        if (cheval==true){
            verif =" a cheval";
        }
        else{
            verif="pas a cheval";}
  
    }
    public boolean ajouterArme (Arme armeAjoute){
        if (tabArmes.size()==5){
            System.out.println("trop d'armes");
            return false;
        }
        else{
            tabArmes.add(armeAjoute);
            return true;
        }
    }
    public void ChoixArme (Arme arme){
        if (tabArmes.contains(arme)){
            armeMain=arme;
        }
        else{
            System.out.println("arme non dispo");
        }
      
    }
    
      public Arme getarmeMain(){
        return armeMain;
    }
    
    public String equipeArme (Arme arme){
        if (tabArmes.contains(arme)){
            armeMain=arme;
            return nom+"equipe avec "+armeMain;
    }
        else{
            return nom+" a pas l'arme"; 
        }}
     public void finalize(){
        nbGuer=nbGuer-1;
    }
    
     public void attaquer (Personnage perso){
            int pv=20;
            if (armeMain instanceof Epee){
                pv=20*((Epee)armeMain).indiceFin;
                fatigue();
            }
            if (cheval==true){
                pv=pv/2;
            }
            perso.estAttaquer(pv);
            System.out.println(perso +"attaque par "+nom);
        }
    
    
    
 
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau vie : " + niveauVie+"a cheval ? "+cheval;
}
}