/* MANGOT Manon
*TP2
*TDA2
*6 octobre 2023 2023
 */
package tp2_bieres_mangot;

/**
 *
 * @author manon
 */
public class TP2_Bieres_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte=false;
        
        uneBiere.lireEtiquette();

        BouteilleBiere deuxiemeBiere = new BouteilleBiere();
        deuxiemeBiere.nom = "Leffe";
        deuxiemeBiere.degreAlcool = 6.6 ;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        
        deuxiemeBiere.lireEtiquette();
        
        


        // TODO code application logic here
    }
    
}
