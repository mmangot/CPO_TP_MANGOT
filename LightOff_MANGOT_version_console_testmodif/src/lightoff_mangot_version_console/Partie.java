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
import java.util.Scanner;

public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    private int nbCoupsMax;

    public Partie() {
        grille = new GrilleDeJeu(4, 4);
        nbCoups = 0;
    }

    public void lancerPartieS() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes() != true) {

            System.out.println(grille);

            System.out.println("Choisissez l'action :");

            System.out.println("1) Activer une ligne");

            System.out.println("2) Activer une colonne");

            System.out.println("3) Activer la diagonale montante");

            System.out.println("4) Activer la diagonale descendante");

            System.out.println("Entrez le numéro de l'action : ");

            int action = scanner.nextInt();

            switch (action) {

                case 1 -> {

                    System.out.println("Entrez le numéro de la ligne à activer : ");

                    int ligneChoisie = scanner.nextInt();

                    grille.activerLigneDeCellules(ligneChoisie);

                }

                case 2 -> {

                    System.out.println("Entrez le numéro de la colonne à activer : ");

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

        System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");

    }

    
    
    public void lancerPartieI() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (grille.cellulesToutesEteintes() != true) {

            System.out.println(grille);

            System.out.println("Choisissez l'action :");

            System.out.println("1) Activer une ligne");

            System.out.println("2) Activer une colonne");

            System.out.println("3) Activer la diagonale montante");

            System.out.println("4) Activer la diagonale descendante");

            System.out.println("Entrez le numéro de l'action : ");

            int action = scanner.nextInt();

            switch (action) {

                case 1 -> {

                    System.out.println("Entrez le numéro de la ligne à activer : ");

                    int ligneChoisie = scanner.nextInt();

                    grille.activerLigneDeCellules(ligneChoisie);

                }

                case 2 -> {

                    System.out.println("Entrez le numéro de la colonne à activer : ");

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

        System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");

    }
    public void initialiserPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        System.out.println("Choisissez le mode de jeu :");
        System.out.println("1. Facile");
        System.out.println("2. Intermediaire");
        System.out.println("3. Compliqué");
        System.out.print("Entrez le numéro du mode : ");
        int choixMode = scanner.nextInt();
        
        
        if (choixMode ==1){
            lancerPartieS();

        if (c
                hoixMode == 1) {
            grille.melangerMatriceAleatoirement(4); // Mode facile
            break;
        } else if (choixMode == 2) {
            grille = new GrilleDeJeu(5, 5); // Mode intermédiaire (grille plus grande)
            nbCoupsMax = 7; // Limite de 7 coups
            break;
        } else if (choixMode == 3) {
            grille = new GrilleDeJeu(6, 6); // Mode difficile (3 états)
            nbCoupsMax = 7; // Limite de 7 coups
            break;
        } else {
            System.out.println("Mode inconnu. La partie sera en mode facile.");
            grille.melangerMatriceAleatoirement(4);
            break;
        }
    }
}

// Le reste du code reste inchangé
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        System.out.println("Choisissez le mode de jeu :");
        System.out.println("1. Facile");
        System.out.println("2. Intermediaire");
        System.out.println("3. Compliqué");
        System.out.print("Entrez le numéro du mode : ");
        int choixMode = scanner.nextInt();

        Partie partie = new Partie();
        partie.initialiserPartie();
        partie.lancerPartie();
    }

    
}
