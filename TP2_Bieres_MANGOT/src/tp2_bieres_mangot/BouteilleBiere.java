/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_mangot;

/**
 *
 * @author manon
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean ouverte) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        boolean ouverture = ouverte;
    }

    public void Decapsuler() {
        if (ouverte == false) {
            ouverte = true;}
        else {
        System.out.println("Erreur la biere est deja ouverte");
     
        }

    }
}
