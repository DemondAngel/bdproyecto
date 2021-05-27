/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import com.upiita.view.fonts.Fuentes;
import java.awt.Font;
import java.awt.FontFormatException;

/**
 *
 * @author Gallegosr
 */
public class Cat_Directores extends javax.swing.JPanel {

    /**
     * Creates new form Cat_Directores
     */
    public Cat_Directores() throws FontFormatException {
        initComponents();
        Font Lovelo = fonttype.nFont(fonttype.getLovelo() , 1,38);
        Font Glacial = fonttype.nFont(fonttype.getGlacial() , 1,20);
        
        jLabelTitulo.setFont(Lovelo);
        jLabelName.setFont(Glacial);
        jList1.setFont(Glacial);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupEstado = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelReturn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 37, 65));
        setName("jPanelAlDirectores"); // NOI18N
        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("ALTAS DIRECTOR ");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        add(jLabelTitulo);
        jLabelTitulo.setBounds(279, 28, 426, 34);

        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nombre");
        jLabelName.setName("jLabelName"); // NOI18N
        add(jLabelName);
        jLabelName.setBounds(38, 128, 45, 16);

        jTextFieldName.setName("jTextName"); // NOI18N
        add(jTextFieldName);
        jTextFieldName.setBounds(190, 120, 159, 24);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(530, 110, 202, 310);

        jLabelReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/return.png"))); // NOI18N
        jLabelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMouseClicked(evt);
            }
        });
        add(jLabelReturn);
        jLabelReturn.setBounds(770, 20, 50, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMouseClicked
        _Directores dir  = new _Directores();
        dir.setBounds(0, 0, 830, 550);
        
        
        
    }//GEN-LAST:event_jLabelReturnMouseClicked

    
    Fuentes fonttype = new Fuentes ();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupEstado;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
