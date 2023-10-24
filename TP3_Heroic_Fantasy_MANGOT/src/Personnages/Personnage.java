/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

        /**
 *
 * @author manon
 */
public abstract class Personnage {
    String nom ;
    int niveauVie ;
    Arme armeMain;
    int nbPerso;
    
    public Personnage (String Nom, int NiveauVie){
        nom=Nom;
        niveauVie=NiveauVie;
        nbPerso+=1;
    }
    public void finale(){
        nbPerso=nbPerso-1;
    }
      public String toString() {
        return "Personnage : " + nom + ", Niveau d'attaque : " + niveauVie;
    }
      
      public void fatigue(){
          niveauVie=niveauVie-10;
      }
      
      public boolean estVivant (){
          if (niveauVie>0){
              System.out.println(nom+" en vie ");
              return true;
          }
          else {
              System.out.println(nom+" mort ");
              return false;
          }
      }
      public void estAttaquer (int pts){
          niveauVie=niveauVie-pts;
      }
     
              
}
