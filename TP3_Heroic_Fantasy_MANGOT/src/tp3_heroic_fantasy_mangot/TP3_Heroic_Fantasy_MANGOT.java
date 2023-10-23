/*
Manon Mangot
TDA2
23/10/2023
 */
package tp3_heroic_fantasy_mangot;

import java.util.ArrayList;

/**
 *
 * @author manon
 */
public class TP3_Heroic_Fantasy_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        System.out.println("Informations sur la première épée : " + epee1);

        System.out.println("\nInformations sur la deuxième épée : " + epee2);

        System.out.println("\nInformations sur le premier bâton : " +baton1);

        System.out.println("\nInformations sur le deuxième bâton : " +baton2);
        
         ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);
    }
}
        // TODO code application logic here
    
    

