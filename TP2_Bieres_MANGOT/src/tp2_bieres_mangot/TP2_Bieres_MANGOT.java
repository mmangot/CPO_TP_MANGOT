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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson",false);
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();

        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe",true);
        deuxiemeBiere.lireEtiquette();
        deuxiemeBiere.Decapsuler();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Monartistes", 10.6, "Les petits dragons",false);
        troisiemeBiere.lireEtiquette();
        troisiemeBiere.Decapsuler();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Copacabaners", 12.6, "La victoire",false);
        quatriemeBiere.lireEtiquette();
        quatriemeBiere.Decapsuler();
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Cow'Brazz", 9.6, "Tout l'epf s'embrasse",true);
        cinquiemeBiere.lireEtiquette();
        cinquiemeBiere.Decapsuler();
        // TODO code application logic here
    }

}
