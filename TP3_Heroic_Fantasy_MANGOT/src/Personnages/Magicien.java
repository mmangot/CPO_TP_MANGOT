/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author manon
 */
public class Magicien extends Personnage{
    private boolean confirme ;  

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }
    
    
    public Magicien(String Nom, int NiveauVie, String C) {
        super(Nom, NiveauVie);
        if ("confirme".equals(C))
            confirme =true;
        else confirme = false;
    }
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauVie+" Confirme ? "+confirme;
    
}}
