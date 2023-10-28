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
     *permet d'inverser l'�tat actuel de la cellule
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
     *permet d'�teindre une cellule si celle ci est allum�e
     */
    public void eteindreCellule(){
              etat = false;
      }
  

    /**
     *permet v�rifier si la cellule est �teinte ou non
     * @return true si elle est �teinte, false si elle ne l'est pas
     */
    public boolean estEteint(){
      return etat == false;
      }
  

    /**
     *renvoie l'�tat actuel de la cellule
     * @return �tat actuel (true=allum�e, false=eteint)
     */
    public boolean getEtat(){
        return etat;
    }
     
  

    /**
     *Cette m�thode renvoie une cha�ne de caract�res "X" si l'�tat de l'objet est vrai (true),
  ou "O" si l'�tat de l'objet est faux (false).
     * 
     * @return une chaine de caract�re 
     */
   @Override
    public String toString() {
       return etat ? "X" : "O"; 
    }
  
}
