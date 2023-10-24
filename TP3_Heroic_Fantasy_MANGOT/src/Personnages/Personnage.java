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
    int niveauVie = 100 ;
    
    public Personnage (String Nom, int NiveauVie){
        nom=Nom;
        niveauVie=NiveauVie;
    }
      public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauVie;
    }
      
      ArrayList<Arme> TableauArmes = new ArrayList<>();
      TableauArmes.add(epee1);
      TableauArmes.add(epee2);
      TableauArmes.add(baton1);
      TableauArmes.add(baton2);
   
      public boolean AjoutArme (Arme armeAjoutee){
          if (TableauArmes.size()<=5){
              TableauArmes.add(armeAjoutee);
              return true;
          }
          else return false;
      }
              
}
