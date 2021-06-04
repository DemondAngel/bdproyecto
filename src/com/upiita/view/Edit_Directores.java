/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import com.upiita.view.fonts.Fuentes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jessl
 */
public class Edit_Directores extends javax.swing.JFrame {

    private String Nombre; 
      
      
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
  
    /**
     * Creates new form Edit_Directores
     */
    public Edit_Directores() throws FontFormatException {
        this.setUndecorated(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-200, dim.height/2-100);
        initComponents();
        Font Lovelo = fonttype.nFont(fonttype.getLovelo() ,1,20);
        Font Glacial = fonttype.nFont(fonttype.getGlacial(),1,17);
        Font Lemon2 = fonttype.nFont(fonttype.getLemon(), 1, 7);
        Font Lemon = fonttype.nFont(fonttype.getLemon() , 1,9);
        
        LabelDirector.setFont(Lovelo);
        Space.setFont(Lemon2);
        txtName.setFont(Lemon);
        btnEditar.setFont(Lemon);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        LabelDirector = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Space = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 80, 107));
        jPanel1.setLayout(null);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(60, 110, 420, 24);

        LabelDirector.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        LabelDirector.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirector.setText("      Editar Director");
        jPanel1.add(LabelDirector);
        LabelDirector.setBounds(60, 50, 360, 45);

        btnEditar.setBackground(new java.awt.Color(11, 19, 43));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);
        btnEditar.setBounds(190, 160, 120, 32);

        jPanel3.setBackground(new java.awt.Color(11, 19, 43));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 24));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(11, 19, 43));
        jPanel5.setPreferredSize(new java.awt.Dimension(32, 24));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/tache.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(18, 24));
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 0, 20, 24);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(490, 0, 50, 24);

        Space.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Space.setForeground(new java.awt.Color(255, 255, 255));
        Space.setText("Editar Director - Base de datos");
        Space.setPreferredSize(new java.awt.Dimension(37, 24));
        jPanel3.add(Space);
        Space.setBounds(10, 0, 340, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 830, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        System.out.print("Sentencia para modificar Director");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        int res = JOptionPane.showConfirmDialog(null, "¿Desea salir de la edición? \n No se guardaran los cambios", "CINETECA NACIONAL ", JOptionPane.YES_NO_OPTION);
        if(res == 0){
            this.setVisible(false);
        }
        else;
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        Color CrossBg = new Color(200,0,0);
        jPanel5.setBackground(CrossBg);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        Color CrossBg = new Color(11,19,43);
        jPanel5.setBackground(CrossBg);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit_Directores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Directores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Directores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Directores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Edit_Directores().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Edit_Directores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void fillGaps (){
       txtName.setText(this.Nombre);
}
    
    Fuentes fonttype = new Fuentes (); 
     static int xx, yy;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDirector;
    private javax.swing.JLabel Space;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
