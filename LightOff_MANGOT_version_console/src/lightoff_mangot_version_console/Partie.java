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

    /**
     *Cr�e une grille et initialise le nbre de coups a zero
     */
    public Partie() {
        grille = new GrilleDeJeu(4, 4);
        nbCoups = 0;
    }

    /**
     *Cr�er et melange la grille
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(4);
    }

    /**
     *Affiche la grille actuelle
     */
    private void afficherEtatGrille() {
        System.out.println(grille);
    }

    
    /**
     *Demande a l'utilisateur quelle colonne ou quelle ligne il veut jouer
     */
    private void demanderCoupAuJoueur(Scanner scanner) {
        System.out.print("Entrez les coordonn�es de cellule � activer : ");
        int ligne = scanner.nextInt();
        int colonne = scanner.nextInt();
    }

    
    /**
     *Donne le resultats avec le nombre de coups r�alis�s
     */
    private void afficherResultats() {
        System.out.println("Toutes les cellules sont �teintes en " + nbCoups + " coups !");
    }

    /**
     *Lance une partie du jeu, l'utilisateur peut jouer
     */
    public void lancerPartie() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes() != true) {

            System.out.println(grille);

            System.out.println("Choisissez l'action :");

            System.out.println("1) Activer une ligne");

            System.out.println("2) Activer une colonne");

            System.out.println("3) Activer la diagonale montante");

            System.out.println("4) Activer la diagonale descendante");

            System.out.println("Entrez le num�ro de l'action : ");

            int action = scanner.nextInt();

            switch (action) {

                case 1 -> {

                    System.out.println("Entrez le num�ro de la ligne � activer : ");

                    int ligneChoisie = scanner.nextInt();

                    grille.activerLigneDeCellules(ligneChoisie);

                }

                case 2 -> {

                    System.out.println("Entrez le num�ro de la colonne � activer : ");

                    int colonneChoisie = scanner.nextInt();

                    grille.activerColonneDeCellules(colonneChoisie);

                }

                case 3 ->
                    grille.activerDiagonaleMontante();

                case 4 ->
                    grille.activerDiagonaleDescendante();

                default ->
                    System.out.println("Choix invalide. Veuillez choisir une autre action");

            }

            nbCoups++;

            System.out.println("Nombre de coups : " + nbCoups);

            grille.toString();

        }

        System.out.println("F�licitations! Vous avez �teint toutes les cellules en " + nbCoups + " coups.");

    }

}
