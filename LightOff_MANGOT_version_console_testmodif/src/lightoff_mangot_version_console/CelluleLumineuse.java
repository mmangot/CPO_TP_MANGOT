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

    // M�thode pour activer la cellule et passer � l'�tat suivant
    public void activerCellule() {
        if (etat == EtatCellule.ALLUMEE) {
            etat = EtatCellule.ETEINTE;
        } else {
            etat = EtatCellule.values()[etat.ordinal() + 1];
        }
    }

    // M�thode pour �teindre la cellule
    public void eteindreCellule() {
        etat = EtatCellule.ETEINTE;
    }

    // M�thode pour v�rifier si la cellule est �teinte
    public boolean estEteint() {
        return etat == EtatCellule.ETEINTE;
    }

    // M�thode pour obtenir l'�tat actuel de la cellule
    public EtatCellule getEtat() {
        return etat;
    }

    // Red�finition de la m�thode toString pour afficher l'�tat de la cellule
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
