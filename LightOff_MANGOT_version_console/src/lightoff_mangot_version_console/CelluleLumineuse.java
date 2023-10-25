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
     *
     * 
     */
    public CelluleLumineuse() {
        etat = false;
    }
    
    /**
     *permet d'inverser l'état actuel de la cellule
     */
    public void activerCellule(boolean cellule){
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
     *permet de vérifier si la cellule est éteinte ou non
     * @param cellule
     * @return oui si elle est éteinte, non si elle ne l'est pas
     */
    public boolean estEteint(boolean cellule){
      return etat == false;
      }
  

    /**
     *renvoie l'état actuel de la cellule
     * @param cellule
     * @return état actuel (true=allumé, false=eteint)
     */
    public boolean getEtat(boolean cellule){
        return etat;
    }
     
  

    /**
     *
     * @param cellule
     * @return
     */
    public String toString() {
       return etat ? "X" : "O"; 
    }
  
}
