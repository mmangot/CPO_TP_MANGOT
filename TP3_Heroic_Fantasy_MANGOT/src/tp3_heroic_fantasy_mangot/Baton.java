/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mangot;

/**
 *
 * @author manon
 */
public class Baton extends Arme {
    int age ;

    public Baton(String Nom, int NiveauAttaque, int age) {
        super(Nom, NiveauAttaque);
        this.age=age;
    }
    
   public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque + " Age : "+age ; 
}}
