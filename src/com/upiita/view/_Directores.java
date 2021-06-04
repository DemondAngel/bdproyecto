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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jessl
 */
public class _Directores extends javax.swing.JPanel {

    /**
     * Creates new form _Directores
     */
    
         TableRowSorter sorter;
 
         
    public _Directores() throws FontFormatException {
        initComponents();
        
        bdel.setVisible(true);
        bedit.setVisible(true);
        panelAdd.setVisible(false);
        
        Font LemonB = fonttype.nFont(fonttype.getLemon(), 1, 5);
        Font Glacial = fonttype.nFont(fonttype.getGlacial() , 1,12);
        Font Lovelo = fonttype.nFont(fonttype.getLovelo() , 1,26);
        
        sorter = new TableRowSorter(TBDirectores.getModel());
        TBDirectores.setRowSorter(sorter);
        TBDirectores.setAlignmentX(10);
        TBDirectores.setFont(Glacial);
        headersDirectores();
        jScrollPane1.getViewport().setBackground(new Color(58,80,107));
        
        txtAltas.setFont(Lovelo);
        txtName.setFont(Glacial);
        btnAlta.setFont(LemonB);
        txtNombreEdit.setFont(LemonB);
        
        
        
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
        badd = new javax.swing.JPanel();
        iadd = new javax.swing.JLabel();
        bdel = new javax.swing.JPanel();
        idel = new javax.swing.JLabel();
        bedit = new javax.swing.JPanel();
        iedit = new javax.swing.JLabel();
        _Display = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBDirectores = new javax.swing.JTable();
        panelAdd = new javax.swing.JPanel();
        txtAltas = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        txtNombreEdit = new javax.swing.JTextField();
        txtName = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 80, 107));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(28, 37, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 50));
        jPanel1.setLayout(null);

        badd.setBackground(new java.awt.Color(28, 37, 65));
        badd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baddMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdelMouseClicked(evt);
            }
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

        bedit.setBackground(new java.awt.Color(28, 37, 65));
        bedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beditMouseClicked(evt);
            }
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

        _Display.setBackground(new java.awt.Color(58, 80, 107));
        _Display.setLayout(null);

        TBDirectores.setBackground(new java.awt.Color(58, 80, 107));
        TBDirectores.setForeground(new java.awt.Color(255, 255, 255));
        TBDirectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ALAIN MAGROU ", "1"},
                {"ZORAN CALIC ", "2"},
                {"ZLATKO LAVANIC", "3"},
                {"YASUJI MARI", "4"},
                {"WLADYSLAW PASIKOWSKI", "5"},
                {"WILLIAM NIGH", "6"},
                {"A. EDWARD SUTHERLAND", "7"},
                {"AARÓN FERNÁNDEZ", "8"},
                {"AARÓN ROMERA", "9"},
                {"BEATRIZ FLORES SILVA", "10"},
                {"BAZ LUHRMANN", null}
            },
            new String [] {
                "Director", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBDirectores.setGridColor(new java.awt.Color(58, 80, 107));
        TBDirectores.setOpaque(false);
        TBDirectores.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(TBDirectores);

        _Display.add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 300, 350);

        panelAdd.setBackground(new java.awt.Color(58, 80, 107));
        panelAdd.setLayout(null);

        txtAltas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtAltas.setForeground(new java.awt.Color(255, 255, 255));
        txtAltas.setText("Altas Directores");
        txtAltas.setName("txtAltas"); // NOI18N
        panelAdd.add(txtAltas);
        txtAltas.setBounds(40, 20, 290, 60);

        btnAlta.setBackground(new java.awt.Color(28, 37, 65));
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("Alta");
        panelAdd.add(btnAlta);
        btnAlta.setBounds(137, 170, 100, 40);

        txtNombreEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditActionPerformed(evt);
            }
        });
        panelAdd.add(txtNombreEdit);
        txtNombreEdit.setBounds(110, 110, 220, 24);

        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("Nombre");
        panelAdd.add(txtName);
        txtName.setBounds(20, 190, 80, 30);

        _Display.add(panelAdd);
        panelAdd.setBounds(450, 120, 350, 230);

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        _Display.add(txtBusqueda);
        txtBusqueda.setBounds(80, 50, 270, 24);

        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Buscar");
        _Display.add(Label);
        Label.setBounds(10, 50, 41, 16);

        add(_Display, java.awt.BorderLayout.CENTER);
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

    private void baddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMousePressed
        badd.setBackground(Bclick);
    }//GEN-LAST:event_baddMousePressed

    private void bdelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMousePressed
        bdel.setBackground(Bclick);
    }//GEN-LAST:event_bdelMousePressed

    private void beditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMousePressed
        bedit.setBackground(Bclick);
    }//GEN-LAST:event_beditMousePressed

    private void baddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseReleased
        badd.setBackground(Bback);
    }//GEN-LAST:event_baddMouseReleased

    private void bdelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseReleased
        bdel.setBackground(Bback);
    }//GEN-LAST:event_bdelMouseReleased

    private void beditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseReleased
        bedit.setBackground(Bback);
    }//GEN-LAST:event_beditMouseReleased

    private void baddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseClicked
       
        panelAdd.setVisible(true);
        DirectoresU.jLabelYUp(190,110, 30, 10, txtName);
    }//GEN-LAST:event_baddMouseClicked

    private void beditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseClicked
        int[] filaSeleccionadas = TBDirectores.getSelectedRows();
        int noFilas = filaSeleccionadas.length;
        if (noFilas == 0) 
            JOptionPane.showMessageDialog(null, "Ingrese una fila para modificar", "CINETECA NACIONAL", HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
        else if (noFilas!=0 && noFilas!=1)
            JOptionPane.showMessageDialog(null, "Solo puede modificar una fila", "CINETECA NACIONAL",HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
        
        else {
            Edit_Directores Modificar = new Edit_Directores ();
            Modificar.setNombre(txtNombreEdit.getText().toUpperCase());
            Modificar.fillGaps();
            Modificar.setVisible(true);
        }
    }//GEN-LAST:event_beditMouseClicked

    private void bdelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseClicked
        int[] filaSeleccionadas = TBDirectores.getSelectedRows();
        int noFilas = filaSeleccionadas.length;
        if (noFilas == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una o varias filas para eliminar", "CINETECA NACIONAL", HEIGHT, NIcon("/com/upiita/view/resources/advertencia.png"));
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar " + noFilas + " filas?", "CINETECA NACIONAL", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                System.out.println("Sentencia para borrar");
            }

            for (int fila : filaSeleccionadas) {
                String pelicula;
                pelicula = TBDirectores.getValueAt(fila,1).toString();
                System.out.println(pelicula);
//            SentenciasSQL.bajaRegistro(alumno, "Alumno", "curp");
            }
        }
    }//GEN-LAST:event_bdelMouseClicked

    private void txtNombreEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
   
        sorter.setRowFilter((RowFilter.regexFilter("(?i)"+txtBusqueda.getText(),0)));
    }//GEN-LAST:event_txtBusquedaKeyReleased
     public void headersDirectores() {
         int[] anchoCol = {300,1};
        int i = 0;
        for (int ancho : anchoCol) { // Implementa el arrego anchoCol en la tabla
            TableColumn column = TBDirectores.getColumnModel().getColumn(i++);
            column.setMinWidth(ancho);
            column.setMaxWidth(ancho);
            column.setPreferredWidth(ancho);
        }
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground( new Color(0,0,0,123) );
        for (int j = 0; j < TBDirectores.getModel().getColumnCount(); j++) {
            TBDirectores.getColumnModel().getColumn(j).setHeaderRenderer(headerRenderer);
        }
    }
    
     
      public Icon NIcon (String path){
        Icon image = new ImageIcon (getClass().getResource(path) );          
        return image;
    }
     
     
    Color change = new Color(111, 255, 233);
    Color Bchange = new Color(43, 59, 86);
    Color Bback = new Color(28, 37, 65);
    Color Bclick = new Color(11, 19, 43);
    Fuentes fonttype = new Fuentes (); 
    AnimationClass DirectoresU = new AnimationClass();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JTable TBDirectores;
    private javax.swing.JPanel _Display;
    private javax.swing.JPanel badd;
    private javax.swing.JPanel bdel;
    private javax.swing.JPanel bedit;
    private javax.swing.JButton btnAlta;
    private javax.swing.JLabel iadd;
    private javax.swing.JLabel idel;
    private javax.swing.JLabel iedit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JLabel txtAltas;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtNombreEdit;
    // End of variables declaration//GEN-END:variables
}
