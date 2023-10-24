/*
Manon Mangot
TDA2
23/10/2023
 */
package tp3_heroic_fantasy_mangot;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
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
        
         ArrayList<Arme> TableauArmes = new ArrayList<>();
        TableauArmes.add(epee1);
        TableauArmes.add(epee2);
        TableauArmes.add(baton1);
        TableauArmes.add(baton2);
        
        for (int i = 0; i < TableauArmes.size(); i++) {
           System.out.println(TableauArmes.get(i));
           
    }
        Magicien magicien1 = new Magicien ("Gandalf",65,true);
        Magicien magicien2 = new Magicien ("Garcimore",44,false);   
        
        Guerrier guerrier1 = new Guerrier ( "Conan", 78, false);
        Guerrier guerrier2 = new Guerrier ("Lannister", 45, true);
        
        System.out.println(magicien1);
        System.out.println(magicien2);
        System.out.println(guerrier1);
        System.out.println(guerrier2);
        
        magicien1.ajouterArme(epee1);
        magicien1.ajouterArme(baton1);
        magicien1.equipeArme(baton1);
        
        guerrier1.ajouterArme(epee2);
        guerrier1.ajouterArme(baton1);
        guerrier1.equipeArme(epee2);
        
        guerrier1.attaquer(magicien1);
        System.out.println(magicien1);
        System.out.println(guerrier1);
        
        magicien1.attaquer(guerrier1);
        System.out.println(guerrier1);
        System.out.println(magicien1);
        
        guerrier1.estVivant();
        magicien1.estVivant();
        
       
}}
        // TODO code application logic here
    
    

