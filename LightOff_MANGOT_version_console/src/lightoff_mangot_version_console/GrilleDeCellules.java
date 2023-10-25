/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mangot_version_console;

/**
 *
 * @author manon
 */
public class GrilleDeCellules {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
    public void GrilleDeJeu(int p_nbLignes, int p_nbColonnes){
        nbLignes=p_nbLignes;
        nbColonnes=p_nbColonnes;
        matriceCellules =new CelluleLumineuse[nbLignes][nbColonnes];
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }}}}

