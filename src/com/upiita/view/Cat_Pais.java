/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import AppPackage.AnimationClass;
import com.upiita.view.fonts.Fuentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import javax.swing.JPanel;

/**
 *
 * @author Gallegosr
 */
public class Cat_Pais extends javax.swing.JPanel {

    /**
     * Creates new form Cat_Pais
     */
    public Cat_Pais() throws FontFormatException {
        initComponents();
        jPanelLista.setOpaque(true);
        jPanelLista.setBackground(new Color(0,0,0,123)); 
        
        Font Lovelo = fonttype.nFont(fonttype.getLovelo() , 1,38);
        Font Glacial = fonttype.nFont(fonttype.getGlacial() , 1,20);
        
        jListPaises.setFont(Glacial);
        jLabelTitulo.setFont(Lovelo);
        
        
         AnimationClass PaisesR = new AnimationClass();
         PaisesR.jLabelXRight(0, 150, 30, 10, jLabelName);
         
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
        jLabelName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPaises = new javax.swing.JList<>();

        setBackground(new java.awt.Color(28, 37, 65));
        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("ALTAS PAÍSES");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        add(jLabelTitulo);
        jLabelTitulo.setBounds(210, 50, 426, 34);

        jLabelName.setText("Nombre");
        add(jLabelName);
        jLabelName.setBounds(0, 163, 45, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(175, 155, 226, 24);

        jPanelLista.setBackground(new java.awt.Color(0, 0, 0));
        jPanelLista.setForeground(new java.awt.Color(0, 0, 0));

        jListPaises.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListPaises);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanelLista);
        jPanelLista.setBounds(428, 125, 385, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

     Fuentes fonttype = new Fuentes ();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListPaises;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}