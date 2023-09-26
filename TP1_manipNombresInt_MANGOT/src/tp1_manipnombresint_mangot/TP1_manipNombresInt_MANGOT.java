/* MANGOT Manon
*TP1
*TDA2
*26 septembre 2023
 */
package tp1_manipnombresint_mangot;

/**
 *
 * @author manon
 */
public class TP1_manipNombresInt_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("\n Entrer le premier nombre  :");
        int entier1=sc.nextInt();
        
 System.out.println("\n Entrer le deuxieme nombre  :");
        int entier2=sc.nextInt(); 
        
  System.out.println("Voici vos nombres : "+entier1+ "et " +entier2);
  int somme=entier1+entier2;
  int diff=entier1-entier2;
  int prod=entier1*entier2;
  int div=entier1/entier2;
  int reste=entier1%entier2;
  System.out.println("Voici la somme des deux nombres : "+somme);
  System.out.println("Voici la difference des deux nombres : "+diff);
  System.out.println("Voici le produit des deux nombres : "+prod);
  System.out.println("Voici la division entiere des deux nombres : "+div);
  System.out.println("Voici la division entiere des deux nombres : "+reste);
    }

}
