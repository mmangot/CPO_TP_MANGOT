/* MANGOT Manon
*TP1
*TDA2
*4 octobre 2023 2023
 */
package tp1_guessmynumber_mangot;

import java.util.Random;

/**
 *
 * @author manon
 */
public class TP1_guessMyNumber_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();

        System.out.println("choisissez un mode de jeu :");
        System.out.println("1)facile\n 2)normal \n 3)difficile");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int mode = sc.nextInt();

        if (mode == 1) {
            System.out.println("Vous avez choisi le mode facile \n entrez une valeur entre 1 et 50 \n vous avez un nombre de tentatives infinie");

            int valeur = sc.nextInt();
            int nombreTent = 1;
            int n = generateurAleat.nextInt(50);
            while (n != valeur) {
                if (n > valeur) {
                    System.out.println("trop petit");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n < valeur) {
                    System.out.println("trop grand");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
            }
            System.out.println("vous avez trouvé le bon nombre");
            System.out.println("vous avez reussi en :" + nombreTent + "tentatives");

        }
        if (mode == 2) {
            System.out.println("entrez une valeur entre 1 et 100");

            int valeur = sc.nextInt();
            int nombreTent = 1;
            int n = generateurAleat.nextInt(100);
            while (n != valeur) {
                if (n > valeur) {
                    System.out.println("trop petit");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n < valeur) {
                    System.out.println("trop grand");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
            }
            System.out.println("vous avez trouvé le bon nombre");
            System.out.println("vous avez reussi en :" + nombreTent + "tentatives");
        }
        if (mode == 3) {
            System.out.println("entrez une valeur entre 1 et 200 \n vous avez 6 tentatives pour reussir");

            int valeur = sc.nextInt();
            int nombreTent = 1;
            int n = generateurAleat.nextInt(200);
            while (n != valeur) {
                if (n > valeur) {
                    System.out.println("trop petit");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n < valeur) {
                    System.out.println("trop grand");
                    valeur = sc.nextInt();
                    nombreTent = nombreTent + 1;

                }
                if (n == valeur) {
                    System.out.println("vous avez trouvé le bon nombre");
                    System.out.println("vous avez reussi en :" + nombreTent + "tentatives");
                }
                 if (nombreTent == 6) {
                        System.out.println("perdu, vous avez atteint le nombre de tentatives max");
                        break;
                    }

                }

            }}}
            // TODO code application logic here
        

    
