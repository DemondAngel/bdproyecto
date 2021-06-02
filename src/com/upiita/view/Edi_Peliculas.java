/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import AppPackage.AnimationClass;
import com.upiita.view.fonts.Fuentes;
import java.awt.Font;
import java.awt.FontFormatException;

/**
 *
 * @author jessl
 */
public class Edi_Peliculas extends javax.swing.JPanel  {

    
    /**
     * Creates new form Edi_Peliculas
     */
    public Edi_Peliculas() throws FontFormatException {
        initComponents();
        Font Lovelo = fonttype.nFont(fonttype.getLovelo() , 1,38);
        Font Glacial = fonttype.nFont(fonttype.getGlacial() , 1,17);
        Font Lemon = fonttype.nFont(fonttype.getLemon() , 1,9);
        jLabelTitulo.setFont(Lovelo);
        
        rbNoIdentificado.setFont(Glacial);
        cbDirector.setFont(Glacial);
        cbPais.setFont(Glacial);
        jTextField2.setFont(Glacial);
        jTextFieldTitle.setFont(Glacial);
        jTextFieldYear.setFont(Glacial);
        btnModificar.setFont(Lemon);
        
         AnimationClass PeliculasR = new AnimationClass();
        javax.swing.JLabel[] labels = new javax.swing.JLabel[6];
        
        labels[0] = jLabelDirector;
        labels[1] = jLabelPais;
        labels[2] = jLabelTitle;
        labels[3] = jLabelTitle1;
        labels[4] = jLabelTitulo;
        labels[5] = jLabelYear;
        
        for (javax.swing.JLabel label : labels) {
            label.setFont(Glacial);
            PeliculasR.jLabelXRight(0, 150, 30, 10, label);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        rbNoIdentificado = new javax.swing.JRadioButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabelYear = new javax.swing.JLabel();
        cbDirector = new javax.swing.JComboBox<>();
        jLabelDirector = new javax.swing.JLabel();
        jTextFieldYear = new javax.swing.JTextField();
        jLabelTitle1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(58, 80, 107));
        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Editar Pelicula");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        add(jLabelTitulo);
        jLabelTitulo.setBounds(300, 20, 250, 60);

        rbNoIdentificado.setForeground(new java.awt.Color(255, 255, 255));
        rbNoIdentificado.setSelected(true);
        rbNoIdentificado.setText("<html> <center> No <p> identificado <center> <html>");
        rbNoIdentificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoIdentificadoActionPerformed(evt);
            }
        });
        add(rbNoIdentificado);
        rbNoIdentificado.setBounds(550, 265, 160, 50);

        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Título de Exhibición");
        add(jLabelTitle);
        jLabelTitle.setBounds(0, 220, 120, 25);

        jLabelPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPais.setText("País");
        add(jLabelPais);
        jLabelPais.setBounds(0, 380, 120, 25);

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisActionPerformed(evt);
            }
        });
        add(cbPais);
        cbPais.setBounds(350, 380, 170, 30);

        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });
        add(jTextFieldTitle);
        jTextFieldTitle.setBounds(350, 220, 171, 24);

        jLabelYear.setForeground(new java.awt.Color(255, 255, 255));
        jLabelYear.setText("Año");
        add(jLabelYear);
        jLabelYear.setBounds(0, 280, 120, 25);

        cbDirector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbDirector);
        cbDirector.setBounds(350, 330, 170, 30);

        jLabelDirector.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDirector.setText("Director");
        add(jLabelDirector);
        jLabelDirector.setBounds(0, 330, 120, 25);

        jTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYearActionPerformed(evt);
            }
        });
        add(jTextFieldYear);
        jTextFieldYear.setBounds(350, 280, 171, 24);

        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setText("Título Original");
        add(jLabelTitle1);
        jLabelTitle1.setBounds(0, 160, 120, 25);

        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(350, 160, 171, 24);

        btnModificar.setBackground(new java.awt.Color(28, 37, 65));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar);
        btnModificar.setBounds(350, 440, 170, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void rbNoIdentificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoIdentificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoIdentificadoActionPerformed

    private void cbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPaisActionPerformed

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

     Fuentes fonttype = new Fuentes ();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbDirector;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldTitle;
    private javax.swing.JTextField jTextFieldYear;
    private javax.swing.JRadioButton rbNoIdentificado;
    // End of variables declaration//GEN-END:variables
}
