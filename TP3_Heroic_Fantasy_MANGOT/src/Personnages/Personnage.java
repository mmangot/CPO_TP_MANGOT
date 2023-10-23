/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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
      
      
}
