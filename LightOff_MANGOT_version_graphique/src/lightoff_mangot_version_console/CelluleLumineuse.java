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
   private boolean etat;
   
    /**
     *initialise l'etat de la cellule a false (eteinte)
     * 
     */
    public CelluleLumineuse() {
        etat = false;
    }
    
    /**
     *permet d'inverser l'état actuel de la cellule
     */
    public void activerCellule(){
      if (etat==true){
          etat=false;
      }
      else {
          etat=true;
      }
  }

    /**
     *permet d'éteindre une cellule si celle ci est allumée
     */
    public void eteindreCellule(){
              etat = false;
      }
  

    /**
     *permet vérifier si la cellule est éteinte ou non
     * @return true si elle est éteinte, false si elle ne l'est pas
     */
    public boolean estEteint(){
      return etat == false;
      }
  

    /**
     *renvoie l'état actuel de la cellule
     * @return état actuel (true=allumée, false=eteint)
     */
    public boolean getEtat(){
        return etat;
    }
     
  

    /**
     *Cette méthode renvoie une chaîne de caractères "X" si l'état de l'objet est vrai (true),
  ou "O" si l'état de l'objet est faux (false).
     * 
     * @return une chaine de caractère 
     */
   @Override
    public String toString() {
       return etat ? "X" : "O"; 
    }
  
}
