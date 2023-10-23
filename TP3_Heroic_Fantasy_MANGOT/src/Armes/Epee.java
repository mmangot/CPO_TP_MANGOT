/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author manon
 */
public class Epee extends Arme {
    int indiceFin ;

    public Epee(String nom, int niveauAttaque, int indiceFin) {
            super(nom, niveauAttaque);
            this.indiceFin=indiceFin;
           }
    
     
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque + " Indice finesse : "+indiceFin;

}}
