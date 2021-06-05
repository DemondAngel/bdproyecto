/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import com.upiita.dao.PeliculaDAO;
import com.upiita.dao.sql.SQLPeliculaDAO;
import com.upiita.model.Director;
import com.upiita.model.Pais;
import com.upiita.model.Pelicula;
import com.upiita.view.fonts.Fuentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class _Peliculas extends javax.swing.JPanel {
        
        private List<Pelicula> peliculas;
        private TableRowSorter sorter;
        private PeliculaDAO peliculaDao;

    /**
     * Creates new form _Peliculas
     */
    public _Peliculas() throws FontFormatException {
        initComponents();
        TBPeliculas.setAlignmentX(10);
        Font LemonB = fonttype.nFont(fonttype.getLemon(), 1, 7);
        Font Glacial = fonttype.nFont(fonttype.getGlacial() , 1,12);
        
        bdel.setVisible(true);
        bedit.setVisible(true);
        breactivar.setVisible(true);
        cbCategoria.setFont(LemonB);
        txtCategoria.setFont(LemonB);
        
      
        TBPeliculas.setFont(Glacial);
        TBPeliculas.setBackground(new Color(58,80,107));
    
        jScrollPane1.getViewport().setBackground(new Color(58,80,107));
        
        try{
            
            peliculaDao = new SQLPeliculaDAO();
                    
            this.peliculas = peliculaDao.readAll();
        }
        catch(Exception xxx){
            xxx.printStackTrace();
            this.peliculas = new ArrayList<>();
        }
        
        this.fillPeliculas();
        
        sorter = new TableRowSorter(TBPeliculas.getModel());
        TBPeliculas.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _Display = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBPeliculas = new javax.swing.JTable();
        cbCategoria = new javax.swing.JComboBox<>();
        txtCategoria = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        badd = new javax.swing.JPanel();
        iadd = new javax.swing.JLabel();
        bdel = new javax.swing.JPanel();
        idel = new javax.swing.JLabel();
        bedit = new javax.swing.JPanel();
        iedit = new javax.swing.JLabel();
        breactivar = new javax.swing.JPanel();
        ireactivar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 80, 107));
        setLayout(new java.awt.BorderLayout());

        _Display.setBackground(new java.awt.Color(58, 80, 107));
        _Display.setName(""); // NOI18N
        _Display.setLayout(null);

        TBPeliculas.setBackground(new java.awt.Color(102, 102, 102));
        TBPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        TBPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"EL SUAVECITO ", "EL SUAVECITO ", "1950 ", "JESUS", "México", "efea", null, null},
                {"LOS DOS CARNALES ", "LOS DOS CARNALES ", "1981 ", "LALO", "México", "lweir34", null, null},
                {"SIMÓN DEL DESIERTO ", "SIMÓN DEL DESIERTO ", "1964 ", "FER", "México", "348975", null, null},
                {"ASÍ SE QUIERE EN JALISCO ", "ASÍ SE QUIERE EN", "1874", "ABI", "México", "4938753", null, null},
                {"STAR WARS", "STAR WARS", "1990", "GEORGE LUCAS", "ESTADOS UNIDOS", "320940", null, null},
                {"EL CÓDIGO DA VINCI", "EL CÓDIGO DA VUNCI", "2010", "ANA", "Colombia", "94075934", null, null},
                {"CODIGO ENIGMA", "CODIGO ENIGMA", "2013", "LUIS", "Panama", "932847", null, null},
                {"RETABLO", "RETABLO", "2015", "DIANA", "Perú", "8374", null, null},
                {"THE THING ABOUT HARRY", "THE THING ABOUT HARRY", "2017", "Oscar", "Bélgica", "93484987", null, null},
                {"MEAN GIRLS", "MEAN GIRLS", "2000", "DANIELA", "España", null, null, null}
            },
            new String [] {
                "Título Original", "Título de Exhibición", "Año", "Director", "País", " ", "Estado", "Title 8"
            }
        ));
        TBPeliculas.setGridColor(new java.awt.Color(58, 80, 107));
        TBPeliculas.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(TBPeliculas);

        _Display.add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 740, 430);

        cbCategoria.setBackground(new java.awt.Color(28, 37, 65));
        cbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoría", "Título Original", "Título de Exhibición", "Año", "Director", "País" }));
        cbCategoria.setBorder(null);
        _Display.add(cbCategoria);
        cbCategoria.setBounds(10, 10, 180, 26);

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyReleased(evt);
            }
        });
        _Display.add(txtCategoria);
        txtCategoria.setBounds(210, 10, 450, 24);

        add(_Display, java.awt.BorderLayout.CENTER);

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

        breactivar.setBackground(new java.awt.Color(28, 37, 65));
        breactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breactivarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                breactivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                breactivarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                breactivarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                breactivarMouseReleased(evt);
            }
        });
        breactivar.setLayout(null);

        ireactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/reactivar.png"))); // NOI18N
        breactivar.add(ireactivar);
        ireactivar.setBounds(10, 10, 30, 30);

        jPanel1.add(breactivar);
        breactivar.setBounds(150, 0, 50, 50);

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

    private void baddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseClicked
        bdel.setVisible(false);
        bedit.setVisible(false);
        breactivar.setVisible(false);
         Cat_Peliculas  addPeliculas = null;
        try {
            addPeliculas = new Cat_Peliculas();
        } catch (FontFormatException ex) {
            Logger.getLogger(_Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        addPeliculas.setBounds(0, 0, 830, 500);
        _Display.removeAll();
        _Display.add(addPeliculas);
        _Display.updateUI();
    }//GEN-LAST:event_baddMouseClicked

    private void bdelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdelMouseClicked
        int[] filaSeleccionadas = TBPeliculas.getSelectedRows();
        int noFilas = filaSeleccionadas.length;
        if (noFilas == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una o varias filas para eliminar", "CINETECA NACIONAL",HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar " + noFilas + " filas?", "CINETECA NACIONAL", JOptionPane.YES_NO_OPTION,HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
            if (res == 0) {
                System.out.println("Sentencia para borrar");
            }

            for (int fila : filaSeleccionadas) {
                String nombrePelicula;
                int anio;
                nombrePelicula = TBPeliculas.getValueAt(fila,0).toString();
                anio = Integer.valueOf(TBPeliculas.getValueAt(fila, 2).toString());
                peliculaDao.delete(new Pelicula(nombrePelicula,anio));
            }
        }
    }//GEN-LAST:event_bdelMouseClicked

    private void beditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseClicked
      
        try {
        int[] filaSeleccionadas = TBPeliculas.getSelectedRows();
        int noFilas = filaSeleccionadas.length;
        if (noFilas == 0) 
            JOptionPane.showMessageDialog(null, "Ingrese una fila para modificar", "CINETECA NACIONAL", HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
        else if (noFilas!=0 && noFilas!=1)
                JOptionPane.showMessageDialog(null, "Solo puede modificar una fila", "CINETECA NACIONAL",HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
         else {
                
            if("0".equals(TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),6).toString())  )
                 JOptionPane.showMessageDialog(null, "No puede modificar una pelicula desactivada", "CINETECA NACIONAL",HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
         
            else{
            Edit_Peliculas Modificar = new Edit_Peliculas();
            
            Modificar.TituloOriginal= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),0).toString();
            Modificar.TituloExhibicion= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),1).toString();
            Modificar.Anio= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),2).toString();
            Modificar.Director= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),3).toString();
            Modificar.Pais= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),4).toString();
            Modificar.ID= TBPeliculas.getValueAt(TBPeliculas.getSelectedRow(),5).toString();
            
            Modificar.fillGaps();
            Modificar.setBounds(600, 300, 830, 500);
            Modificar.setVisible(true);
        }}
        } catch (FontFormatException ex) {
            Logger.getLogger(_Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }//GEN-LAST:event_beditMouseClicked

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    /**
     * Método que realiza la búsqueda de las tablas
     * @param evt 
     */
    private void txtCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyReleased
        if (cbCategoria.getSelectedIndex() != 0)
            sorter.setRowFilter((RowFilter.regexFilter("(?i)"+txtCategoria.getText().toUpperCase(),cbCategoria.getSelectedIndex()-1)));
    }//GEN-LAST:event_txtCategoriaKeyReleased

    private void breactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breactivarMouseClicked
        int[] filaSeleccionadas = TBPeliculas.getSelectedRows();
        int noFilas = filaSeleccionadas.length;
        if (noFilas == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una o varias filas para reactivar", "CINETECA NACIONAL",HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿Desea reactivar " + noFilas + " filas?", "CINETECA NACIONAL", JOptionPane.YES_NO_OPTION,HEIGHT,NIcon("/com/upiita/view/resources/advertencia.png"));
            if (res == 0) {
               
            for (int fila : filaSeleccionadas) {
                String nombrePelicula;
                int anio;
                nombrePelicula = TBPeliculas.getValueAt(fila,0).toString();
                anio = Integer.valueOf(TBPeliculas.getValueAt(fila, 2).toString());
                peliculaDao.reactive(new Pelicula(nombrePelicula,anio));
            }
            }
        }
    }//GEN-LAST:event_breactivarMouseClicked

    private void breactivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breactivarMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/reactivar2.png"));
        ireactivar.setIcon(ic);
        breactivar.setBackground(Bchange);
    }//GEN-LAST:event_breactivarMouseEntered

    private void breactivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breactivarMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/reactivar.png"));
        ireactivar.setIcon(ic);
        breactivar.setBackground(Bback);
    }//GEN-LAST:event_breactivarMouseExited

    private void breactivarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breactivarMousePressed
        breactivar.setBackground(Bclick);
    }//GEN-LAST:event_breactivarMousePressed

    private void breactivarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breactivarMouseReleased
        
    }//GEN-LAST:event_breactivarMouseReleased
    
     public void headersPeliculas() {
         int[] anchoCol = {270, 190,70,120,100,1,1};
        int i = 0;
        for (int ancho : anchoCol) { // Implementa el arrego anchoCol en la tabla
            TableColumn column = TBPeliculas.getColumnModel().getColumn(i++);
            column.setMinWidth(ancho);
            column.setMaxWidth(ancho);
            column.setPreferredWidth(ancho);
        }
       
        headerRenderer.setBackground( new Color(28,37,65) );
        for (int j = 0; j < TBPeliculas.getModel().getColumnCount(); j++) {
            TBPeliculas.getColumnModel().getColumn(j).setHeaderRenderer(headerRenderer);
        }
    }
    
      public void fillPeliculas() {
          
        int len = this.peliculas.size();
        // Inicializa la matriz modelo para mostrar en la tabla 
        String m[][] = new String[len > 0 ? len: 1][7];
        //LLena filas de la tabla con los datos del arrayList del archivo 
        
        for (int i = 0; i < len; i++) {
        
            m[i][0] = String.valueOf(peliculas.get (i).getTituloOriginal());
            m[i][1] = peliculas.get(i).getTituloExhibicion();
            m[i][2] = String.valueOf(peliculas.get(i).getAnio());
            
            for(Director dir: peliculas.get(i).getDirectores())
                m[i][3] = dir.getNombre()+" ";
            
            for(Pais pais: peliculas.get(i).getPaises())
                m[i][4] = pais.getNombre()+" ";            
            
            m[i][5] = String.valueOf(peliculas.get(i).getIdPelicula());
            m[i][6] =String.valueOf(peliculas.get(i).getEstado());
        }
        
        // Implementa la matriz en la tabla
        TBPeliculas.setModel(new javax.swing.table.DefaultTableModel(
                m, new String[]{"Título Original","Titulo Original","Año", "Director", "País","ID","Estado"}));
        headersPeliculas();
        RowsRenderer rr = new RowsRenderer(6);
        TBPeliculas.setDefaultRenderer(Object.class, rr);
               
      
    } 
     
     
      /**
     * Método que  regresa un ícono a partir de una imagen
     * @param path ruta de la imagen 
     * @return 
     */
    public Icon NIcon (String path){
        Icon image = new ImageIcon (getClass().getResource(path) );          
        return image;
    }
    
    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    Color change = new Color(111, 255, 233);
    Color Bchange = new Color(43, 59, 86);
    Color Bback = new Color(28, 37, 65);
    Color Bclick = new Color(11, 19, 43);
    Color transparent =new Color (255,255,255,40);
    Fuentes fonttype = new Fuentes (); 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBPeliculas;
    private javax.swing.JPanel _Display;
    private javax.swing.JPanel badd;
    private javax.swing.JPanel bdel;
    private javax.swing.JPanel bedit;
    private javax.swing.JPanel breactivar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel iadd;
    private javax.swing.JLabel idel;
    private javax.swing.JLabel iedit;
    private javax.swing.JLabel ireactivar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables



}
