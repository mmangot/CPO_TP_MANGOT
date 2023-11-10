/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_mangot_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author manon
 */
public class FenetrePrincipale extends javax.swing.JFrame {
int nbCouups=0;
GrilleDeJeu grille;
    /**
     * Creates new form FenetrePrincipale
     */ 
        int i ;
        int a;
        public void initialiserPartie() {
 grille.eteindreToutesLesCellules();
 grille.melangerMatriceAleatoirement(10);
 }

    public FenetrePrincipale(int nbCoups, int nbLigne) {
        initComponents();
        
         int nbLignes = nbLigne;
        int nbColonnes = nbLigne;
        int nbCoup = nbCoups;
        jLabel2.setText(""+(nbCoup-nbCouups)+"");
        
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80,nbColonnes*40, nbLignes*40));
this.pack();
this.revalidate();



PanneauBoutonVerticaux1.setLayout(new GridLayout(nbLignes, 1));
 getContentPane().add(PanneauBoutonVerticaux1, new
org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1 * 40, nbLignes * 40));
 this.pack();
 this.revalidate();
       // création du panneau de boutons verticaux (pour les lignes)
 for ( i = 0; i < nbLignes; i++) {
 JButton bouton_ligne = new JButton();
 ActionListener ecouteurClick = new ActionListener() {
 final int j = i;
 
 
 @Override
  public void actionPerformed(ActionEvent e) {
 grille.activerLigneDeCellules(j);
 nbCouups++;
 jLabel2.setText(""+(nbCoup-nbCouups)+"");
 if (nbCouups==nbCoups){
             FenetreDefaite f = new FenetreDefaite();
        f.setVisible(true);
        this.dispose();
        }
 if (grille.cellulesToutesEteintes()==true){
            FenetreGagant f = new FenetreGagant();
        f.setVisible(true);
        this.dispose();
        }
repaint();
 }

     private void dispose() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
 };
 bouton_ligne.addActionListener(ecouteurClick);
 PanneauBoutonVerticaux1.add(bouton_ligne);

 }
 
 
 PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
 getContentPane().add(PanneauBoutonHorizontaux, new
org.netbeans.lib.awtextra.AbsoluteConstraints(108, 20, nbColonnes * 40, 1 * 40));
 this.pack();
 this.revalidate();
       // création du panneau de boutons verticaux (pour les lignes)
 for ( a = 0; a < nbColonnes; a++) {
 JButton bouton_colonne = new JButton();
 ActionListener ecouteurClick = new ActionListener() {
 final int b = a;
 
 
 @Override
 public void actionPerformed(ActionEvent e) {
 grille.activerColonneDeCellules(b);
  nbCouups++;
  jLabel2.setText(""+(nbCoup-nbCouups)+"");
  if (nbCouups==nbCoups){
             FenetreDefaite f = new FenetreDefaite();
        f.setVisible(true);
        this.dispose();
        }
  if (grille.cellulesToutesEteintes()==true){
            FenetreGagant f = new FenetreGagant();
        f.setVisible(true);
        this.dispose();
        }
repaint();
 }

     private void dispose() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
 };
 bouton_colonne.addActionListener(ecouteurClick);
 PanneauBoutonHorizontaux.add(bouton_colonne);

 }
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        
btnDiagoM.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt){
        btnDiagoMActionPerformed(evt);
        nbCouups++;
        grille.activerDiagonaleMontante();
        jLabel2.setText(""+(nbCoup-nbCouups)+"");
        if (nbCouups==nbCoups){
             FenetreDefaite f = new FenetreDefaite();
        f.setVisible(true);
        this.dispose();
        }
        if (grille.cellulesToutesEteintes()==true){
            FenetreGagant f = new FenetreGagant();
        f.setVisible(true);
        this.dispose();
        }
    }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
 btnDiagoD.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt){
        btnDiagoDActionPerformed(evt);
        nbCouups++;
        grille.activerDiagonaleDescendante();
        jLabel2.setText(""+(nbCoup-nbCouups)+"");
        if (nbCouups==nbCoups){
             FenetreDefaite f = new FenetreDefaite();
        f.setVisible(true);
        this.dispose();
        }  
        if (grille.cellulesToutesEteintes()==true){
            FenetreGagant f = new FenetreGagant();
        f.setVisible(true);
        this.dispose();
        }
    }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

 
        initialiserPartie();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonVerticaux1 = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        btnDiagoD = new javax.swing.JButton();
        btnDiagoM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 360, 360));

        PanneauBoutonVerticaux1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauBoutonVerticaux1Layout = new javax.swing.GroupLayout(PanneauBoutonVerticaux1);
        PanneauBoutonVerticaux1.setLayout(PanneauBoutonVerticaux1Layout);
        PanneauBoutonVerticaux1Layout.setHorizontalGroup(
            PanneauBoutonVerticaux1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        PanneauBoutonVerticaux1Layout.setVerticalGroup(
            PanneauBoutonVerticaux1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 360));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 360, 60));

        btnDiagoD.setText("jButton1");
        btnDiagoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagoDActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 50));

        btnDiagoM.setText("jButton1");
        btnDiagoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagoMActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 50));

        jLabel1.setText("Nombre coups restants :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(36, 27));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagoDActionPerformed
  this.grille.activerDiagonaleDescendante();
 repaint(); 
 getContentPane().add(btnDiagoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 50));// TODO add your handling code here:
    }//GEN-LAST:event_btnDiagoDActionPerformed

    private void btnDiagoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagoMActionPerformed
this.grille.activerDiagonaleMontante();
 repaint();
  getContentPane().add(btnDiagoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 40, 50));// TODO add your handling code here:
    }//GEN-LAST:event_btnDiagoMActionPerformed

    /**

     * @param args the command line arguments

     */

    /*

    public static void main(String args[]) {

       

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;

                }

            }

        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>

 

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new FenetrePrincipale(4).setVisible(true);

            }

        });

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux1;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnDiagoD;
    private javax.swing.JButton btnDiagoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
