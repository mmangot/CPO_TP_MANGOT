/* MANGOT Manon
*TP1
*TDA2
*4 octobre 2023 2023
 */
package tp1_stats_mangot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manon
 */
public class TP1_stats_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] des = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre entier m : ");
        int m = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int resultat = random.nextInt(6);
            des[resultat]++;
        }

        System.out.println("Résultat du lancer de dés :");
        for (int i = 0; i < des.length; i++) {
            double pourcentage = ((double) des[i] / m) * 100;
            System.out.println("Face " + (i + 1) + " : " + pourcentage +"%" );
        }
    }
}
        // TODO code application logic here
    
    

