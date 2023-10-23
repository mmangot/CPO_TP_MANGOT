/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author manon
 */
public class Guerrier extends Personnage {
    private boolean cheval ;

    public boolean isCheval() {
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
   
    public Guerrier(String Nom, int NiveauVie, String Ch) {
        super(Nom, NiveauVie);
  
    
     if ("a cheval".equals(Ch))
            cheval =true;
     
        else cheval = false;
    }
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau vie : " + niveauVie+"a cheval ? "+cheval;
}
}