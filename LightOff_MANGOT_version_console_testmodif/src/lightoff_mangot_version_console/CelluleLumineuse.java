/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mangot_version_console;

/**
 *
 * @author manon
 */
public class CelluleLumineuse {
    public enum EtatCellule {
        ETEINTE,
        PRESQUE_ETEINTE,
        ALLUMEE
    }

    private EtatCellule etat;

    // Constructeur
    public CelluleLumineuse() {
        etat = EtatCellule.ETEINTE;
    }

    // Méthode pour activer la cellule et passer à l'état suivant
    public void activerCellule() {
        if (etat == EtatCellule.ALLUMEE) {
            etat = EtatCellule.ETEINTE;
        } else {
            etat = EtatCellule.values()[etat.ordinal() + 1];
        }
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        etat = EtatCellule.ETEINTE;
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return etat == EtatCellule.ETEINTE;
    }

    // Méthode pour obtenir l'état actuel de la cellule
    public EtatCellule getEtat() {
        return etat;
    }

    // Redéfinition de la méthode toString pour afficher l'état de la cellule
    @Override
    public String toString() {
        switch (etat) {
            case ETEINTE:
                return "O";
            case PRESQUE_ETEINTE:
                return "?";
            case ALLUMEE:
                return "X";
            default:
                return "O";
        }
    }
}
