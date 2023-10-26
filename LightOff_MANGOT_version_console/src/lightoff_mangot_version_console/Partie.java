/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mangot_version_console;

import java.util.Scanner;

/**
 *
 * @author manon
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    
    public Partie() {
        grille = new GrilleDeJeu(); 
        nbCoups = 0;}
    
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(4);}
    
     public void lancerPartie() {
         initialiserPartie(); 

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            afficherEtatGrille();
            demanderCoupAuJoueur(scanner);
            nbCoups++;
        }

        afficherEtatGrille();
        afficherResultats();
    }

   
    private void afficherEtatGrille() {
        System.out.println(grille);
    }

    
    private void demanderCoupAuJoueur(Scanner scanner) {
        System.out.print("Entrez les coordonnées (ligne, colonne) de la cellule à activer : ");
        int ligne = scanner.nextInt();
        int colonne = scanner.nextInt();

        
        
    }

    
    private void afficherResultats() {
        System.out.println("Toutes les cellules sont éteintes en " + nbCoups + " coups !");
    }
}
