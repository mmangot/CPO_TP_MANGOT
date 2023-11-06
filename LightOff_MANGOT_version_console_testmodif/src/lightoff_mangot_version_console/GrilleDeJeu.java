/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mangot_version_console;

import java.util.Random;

/**
 *
 * @author manon
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    
    /**
     *Initialise une nouvelle grille de jeu avec le nombre sp�cifi� de lignes et de colonnes.
 *
     * @param p_nbLignes nombre de lignes souhait�
     * @param p_nbColonnes nombre de colonnes souhait�
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes){
        nbLignes=p_nbLignes;
        nbColonnes=p_nbColonnes;
        matriceCellules =new CelluleLumineuse[nbLignes][nbColonnes];
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }}}

    /**
     *Parcours toutes les celulles de la grille pour les eteindre ( a l'aide de la methode : eteindreCellule)
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }}
    }
    
    /**
     *  Active al�atoirement une ligne, une colonne ou une diagonale de cellules lumineuses.
     * Choisit al�atoirement entre activer une ligne enti�re, une colonne enti�re ou
     * une diagonale de cellules lumineuses dans la grille de jeu grace � un
     * nombre g�n�r� al�atoirement,puis elle active les cellules correspondantes.
     
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3);

        if (choix == 0) {
            int ligne = rand.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonne = rand.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        } else {
                       for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

    /**
     *Melange al�atoirement la grille avec un nombre de tours defini
     * On eteint d'abord toutes les cellules puis on active al�atoirement des cellules
     * @param nbTours nombre de tours souhait�s pour melanger
     */
    public void melangerMatriceAleatoirement(int nbTours){
         eteindreToutesLesCellules();

        Random rand = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = rand.nextInt(3);

            if (choix == 0) {
                int ligne = rand.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].activerCellule();
                }
            } else if (choix == 1) {
                int colonne = rand.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
            } else {
                for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                    matriceCellules[i][i].activerCellule();
                }
            }
        }
    
    }
    
    /**
     *Active toutes les cellules d'une ligne demand�e
     * 
     * @param idLigne numero de la ligne a activer 
     */
    public void activerLigneDeCellules(int idLigne){
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }}
    }
    
    /**
     *Active toutes les cellules d'une colonne demand�e
     * @param idColonne numero de la colonne a activer
     */
    public void activerColonneDeCellules(int idColonne){
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
    }}
    
    /**
     *V�rifie que toutes les cellulles sont eteintes
     * @return true si toutes les cellules sont �teintes, false sinon
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     *Permet d'afficher la grille de jeu 
     * @return la grille de jeu 
     */
    @Override
    public String toString() {
    StringBuilder grilleString = new StringBuilder();  
    grilleString.append("  ");
    for (int j = 0; j < nbColonnes; j++) {
        grilleString.append(" " + j);
    }
    grilleString.append("\n");
  for (int i = 0; i < nbLignes; i++) {
    grilleString.append(i + " ");
    for (int j = 0; j < nbColonnes; j++) {
        CelluleLumineuse.EtatCellule etatCellule = matriceCellules[i][j].getEtat();
        switch (etatCellule) {
            case ALLUMEE:
                grilleString.append("X");
                break;
            case PRESQUE_ETEINTE:
                grilleString.append("?");
                break;
            case ETEINTE:
                grilleString.append("O");
                break;
        }
        grilleString.append(" ");
    }
    grilleString.append("\n");
}
return grilleString.toString();
}
    
    /**
     *Permet d'activer la diagonale montante (grille carr�e)
     */
    public void activerDiagonaleMontante(){
        int minDim=Math.min(nbLignes, nbColonnes);
        for (int i=0; i<minDim; i++){
            matriceCellules [i][nbColonnes-1-i].activerCellule();
        }
    }
    
    /**
     *Permet d'activer la diagonale descendante (grille carr�e)
     */
    public void activerDiagonaleDescendante(){
        int minDim=Math.min(nbLignes, nbColonnes);
        for (int i=0; i<minDim; i++){
            matriceCellules [i][i].activerCellule();
        }
    }
}

