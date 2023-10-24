/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;
import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author manon
 */
public class Magicien extends Personnage{
    boolean confirme;
    String verif;
    ArrayList <Arme> tabArmes= new ArrayList<Arme>();
    Arme armeMain;
    int nbMag;
    
    public Magicien(String Nom, int NiveauVie, boolean conf) {
        super(Nom, NiveauVie);
        confirme=conf;
        armeMain=null;
        nbMag+=1;
        
        if (confirme==true){
            verif="confirme";
        }
        else{
            verif="novice";
        }
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
        }
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau vie : " + niveauVie+" Confirme ? "+confirme;
    
}}
