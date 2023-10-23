/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author manon
 */
public abstract class Arme {
    String nom ;
  

    int niveauAttaque ;
    
    
    public Arme (String Nom, int NiveauAttaque){
        nom=Nom;
        niveauAttaque=NiveauAttaque;
    }
      public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
    
}
