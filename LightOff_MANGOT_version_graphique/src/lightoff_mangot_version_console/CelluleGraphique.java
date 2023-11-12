/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mangot_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author manon
 */
public class CelluleGraphique extends JButton{
   
 CelluleLumineuse celluleLumineuseAssociee;
 int largeur;
 int longueur;
 
 @Override
  protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.estEteint() == true) {
 g.setColor(new Color (0,102,102));
 } else {
 g.setColor(new Color(204,204,255));
 }
 
 g.fillOval(2, 2, w - 4, h - 4);
 }

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }




 
 
}
