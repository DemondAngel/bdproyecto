/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author jessl
 */
public class _Paises extends javax.swing.JPanel {

    /**
     * Creates new form _Paises
     */
    public _Paises() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        badd = new javax.swing.JPanel();
        iadd = new javax.swing.JLabel();
        bdel = new javax.swing.JPanel();
        idel = new javax.swing.JLabel();
        bsrc = new javax.swing.JPanel();
        isrc = new javax.swing.JLabel();
        bedit = new javax.swing.JPanel();
        iedit = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(58, 80, 107));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(28, 37, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 50));
        jPanel1.setLayout(null);

        badd.setBackground(new java.awt.Color(28, 37, 65));
        badd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                baddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                baddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                baddMouseReleased(evt);
            }
        });
        badd.setLayout(null);

        iadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/plus-square-solid.png"))); // NOI18N
        badd.add(iadd);
        iadd.setBounds(10, 10, 30, 30);

        jPanel1.add(badd);
        badd.setBounds(0, 0, 50, 50);

        bdel.setBackground(new java.awt.Color(28, 37, 65));
        bdel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bdelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bdelMouseReleased(evt);
            }
        });
        bdel.setLayout(null);

        idel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/minus-square-solid.png"))); // NOI18N
        bdel.add(idel);
        idel.setBounds(10, 10, 30, 30);

        jPanel1.add(bdel);
        bdel.setBounds(50, 0, 50, 50);

        bsrc.setBackground(new java.awt.Color(28, 37, 65));
        bsrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bsrcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bsrcMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bsrcMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bsrcMouseReleased(evt);
            }
        });
        bsrc.setLayout(null);

        isrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/lupa.png"))); // NOI18N
        bsrc.add(isrc);
        isrc.setBounds(10, 10, 30, 30);

        jPanel1.add(bsrc);
        bsrc.setBounds(150, 0, 50, 50);

        bedit.setBackground(new java.awt.Color(28, 37, 65));
        bedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                beditMouseReleased(evt);
            }
        });
        bedit.setLayout(null);

        iedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/pen-square-solid.png"))); // NOI18N
        bedit.add(iedit);
        iedit.setBounds(10, 10, 30, 30);

        jPanel1.add(bedit);
        bedit.setBounds(100, 0, 50, 50);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void baddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/plus-square-solid2.png"));
        iadd.setIcon(ic);
        badd.setBackground(Bchange);
    }//GEN-LAST:event_baddMouseEntered

    private void baddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/plus-square-solid.png"));
        iadd.setIcon(ic);
        badd.setBackground(Bback);
    }//GEN-LAST:event_baddMouseExited

    private void baddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMousePressed
        badd.setBackground(Bclick);
    }//GEN-LAST:event_baddMousePressed

    private void baddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseReleased
        badd.setBackground(Bback);
    }//GEN-LAST:event_baddMouseReleased

    private void bdelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/minus-square-solid2.png"));
        idel.setIcon(ic);
        bdel.setBackground(Bchange);
    }//GEN-LAST:event_bdelMouseEntered

    private void bdelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/minus-square-solid.png"));
        idel.setIcon(ic);
        bdel.setBackground(Bback);
    }//GEN-LAST:event_bdelMouseExited

    private void bdelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMousePressed
        bdel.setBackground(Bclick);
    }//GEN-LAST:event_bdelMousePressed

    private void bdelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseReleased
        bdel.setBackground(Bback);
    }//GEN-LAST:event_bdelMouseReleased

    private void bsrcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsrcMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/lupa2.png"));
        isrc.setIcon(ic);
        bsrc.setBackground(Bchange);
    }//GEN-LAST:event_bsrcMouseEntered

    private void bsrcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsrcMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/lupa.png"));
        isrc.setIcon(ic);
        bsrc.setBackground(Bback);
    }//GEN-LAST:event_bsrcMouseExited

    private void bsrcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsrcMousePressed
        bsrc.setBackground(Bclick);
    }//GEN-LAST:event_bsrcMousePressed

    private void bsrcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsrcMouseReleased
        bsrc.setBackground(Bback);
    }//GEN-LAST:event_bsrcMouseReleased

    private void beditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/pen-square-solid2.png"));
        iedit.setIcon(ic);
        bedit.setBackground(Bchange);
    }//GEN-LAST:event_beditMouseEntered

    private void beditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/pen-square-solid.png"));
        iedit.setIcon(ic);
        bedit.setBackground(Bback);
    }//GEN-LAST:event_beditMouseExited

    private void beditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMousePressed
        bedit.setBackground(Bclick);
    }//GEN-LAST:event_beditMousePressed

    private void beditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseReleased
        bedit.setBackground(Bback);
    }//GEN-LAST:event_beditMouseReleased

    Color change = new Color(111, 255, 233);
    Color Bchange = new Color(43, 59, 86);
    Color Bback = new Color(28, 37, 65);
    Color Bclick = new Color(11, 19, 43);
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel badd;
    private javax.swing.JPanel bdel;
    private javax.swing.JPanel bedit;
    private javax.swing.JPanel bsrc;
    private javax.swing.JLabel iadd;
    private javax.swing.JLabel idel;
    private javax.swing.JLabel iedit;
    private javax.swing.JLabel isrc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
