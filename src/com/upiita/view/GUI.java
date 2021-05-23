package com.upiita.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {


    public GUI() {
        setLocation(500,250);
        setUndecorated(true);
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/iconapp.png")).getImage());
        setTitle("Cineteca Nacional - Base de datos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        _Dbutton = new javax.swing.JPanel();
        Dicon = new javax.swing.JLabel();
        Dname = new javax.swing.JLabel();
        _Pbutton = new javax.swing.JPanel();
        Picon = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        _Cbutton = new javax.swing.JPanel();
        Cicon = new javax.swing.JLabel();
        Cname = new javax.swing.JLabel();
        _display = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 19, 43));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 24));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(11, 19, 43));
        jPanel4.setPreferredSize(new java.awt.Dimension(32, 24));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/tache.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(18, 24));
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 0, 20, 24);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(860, 0, 40, 24);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cineteca Nacional - Base de datos");
        jLabel2.setPreferredSize(new java.awt.Dimension(37, 24));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 200, 20);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(28, 37, 65));
        jPanel3.setPreferredSize(new java.awt.Dimension(70, 550));
        jPanel3.setLayout(null);

        _Dbutton.setBackground(new java.awt.Color(28, 37, 65));
        _Dbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _DbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _DbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _DbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _DbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _DbuttonMouseReleased(evt);
            }
        });
        _Dbutton.setLayout(null);

        Dicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/glasses-solid.png"))); // NOI18N
        _Dbutton.add(Dicon);
        Dicon.setBounds(10, 10, 50, 40);

        Dname.setBackground(new java.awt.Color(255, 255, 255));
        Dname.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Dname.setForeground(new java.awt.Color(255, 255, 255));
        Dname.setText(" Directores");
        _Dbutton.add(Dname);
        Dname.setBounds(0, 50, 70, 30);

        jPanel3.add(_Dbutton);
        _Dbutton.setBounds(0, 80, 70, 80);

        _Pbutton.setBackground(new java.awt.Color(28, 37, 65));
        _Pbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _PbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _PbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _PbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _PbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _PbuttonMouseReleased(evt);
            }
        });
        _Pbutton.setLayout(null);

        Picon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/film-solid.png"))); // NOI18N
        _Pbutton.add(Picon);
        Picon.setBounds(10, 10, 50, 40);

        Pname.setBackground(new java.awt.Color(255, 255, 255));
        Pname.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        Pname.setText("Peliculas");
        _Pbutton.add(Pname);
        Pname.setBounds(10, 50, 50, 30);

        jPanel3.add(_Pbutton);
        _Pbutton.setBounds(0, 0, 70, 80);

        _Cbutton.setBackground(new java.awt.Color(28, 37, 65));
        _Cbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _CbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _CbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _CbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _CbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _CbuttonMouseReleased(evt);
            }
        });
        _Cbutton.setLayout(null);

        Cicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/globe-americas-solid.png"))); // NOI18N
        _Cbutton.add(Cicon);
        Cicon.setBounds(13, 10, 44, 44);

        Cname.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Cname.setForeground(new java.awt.Color(255, 255, 255));
        Cname.setText("    Países");
        _Cbutton.add(Cname);
        Cname.setBounds(0, 58, 70, 20);

        jPanel3.add(_Cbutton);
        _Cbutton.setBounds(0, 160, 70, 80);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        _display.setBackground(new java.awt.Color(58, 80, 107));
        _display.setPreferredSize(new java.awt.Dimension(830, 550));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/upiita/view/Resources/Cineteca_Nacional_logotipo_SVG.png"))); // NOI18N

        javax.swing.GroupLayout _displayLayout = new javax.swing.GroupLayout(_display);
        _display.setLayout(_displayLayout);
        _displayLayout.setHorizontalGroup(
            _displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_displayLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        _displayLayout.setVerticalGroup(
            _displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_displayLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel7)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(_display, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        Color CrossBg = new Color(200,0,0);
        jPanel4.setBackground(CrossBg);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        Color CrossBg = new Color(11,19,43);
        jPanel4.setBackground(CrossBg);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        int res = JOptionPane.showConfirmDialog(null, "Desea cerrar del programa?", "Cineteca Nacional", JOptionPane.YES_NO_OPTION);
        if(res == 0){
            System.exit(0);
        }
        else;
    }//GEN-LAST:event_jPanel4MouseClicked

    private void _PbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__PbuttonMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/film-solid2.png"));
        Picon.setIcon(ic);
        Pname.setForeground(change);
        _Pbutton.setBackground(Bchange);
    }//GEN-LAST:event__PbuttonMouseEntered

    private void _PbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__PbuttonMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/film-solid.png"));
        Picon.setIcon(ic);
        Pname.setForeground(Color.white);
        _Pbutton.setBackground(Bback);
    }//GEN-LAST:event__PbuttonMouseExited

    private void _DbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__DbuttonMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/glasses-solid2.png"));
        Dicon.setIcon(ic);
        Dname.setForeground(change);
        _Dbutton.setBackground(Bchange);
    }//GEN-LAST:event__DbuttonMouseEntered

    private void _DbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__DbuttonMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/glasses-solid.png"));
        Dicon.setIcon(ic);
        Dname.setForeground(Color.white);
        _Dbutton.setBackground(Bback);
    }//GEN-LAST:event__DbuttonMouseExited

    private void _CbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__CbuttonMouseEntered
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/globe-americas-solid2.png"));
        Cicon.setIcon(ic);
        Cname.setForeground(change);
        _Cbutton.setBackground(Bchange);
    }//GEN-LAST:event__CbuttonMouseEntered

    private void _CbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__CbuttonMouseExited
        ImageIcon ic = new ImageIcon(getClass().getResource("/com/upiita/view/resources/globe-americas-solid.png"));
        Cicon.setIcon(ic);
        Cname.setForeground(Color.white);
        _Cbutton.setBackground(Bback);
    }//GEN-LAST:event__CbuttonMouseExited

    private void _PbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__PbuttonMouseClicked
        _Peliculas pel = new _Peliculas();
        pel.setBounds(0, 0, 830, 550);
        _display.removeAll();
        _display.add(pel);
        _display.updateUI();
    }//GEN-LAST:event__PbuttonMouseClicked

    private void _DbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__DbuttonMouseClicked
        _Directores dir = new _Directores();
        dir.setBounds(0, 0, 830, 550);
        _display.removeAll();
        _display.add(dir);
        _display.updateUI();
    }//GEN-LAST:event__DbuttonMouseClicked

    private void _CbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__CbuttonMouseClicked
        _Paises pai = new _Paises();
        pai.setBounds(0, 0, 830, 550);
        _display.removeAll();
        _display.add(pai);
        _display.updateUI();
    }//GEN-LAST:event__CbuttonMouseClicked

    private void _PbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__PbuttonMousePressed
        _Pbutton.setBackground(Bclick);
    }//GEN-LAST:event__PbuttonMousePressed

    private void _DbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__DbuttonMousePressed
        _Dbutton.setBackground(Bclick);
    }//GEN-LAST:event__DbuttonMousePressed

    private void _CbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__CbuttonMousePressed
        _Cbutton.setBackground(Bclick);
    }//GEN-LAST:event__CbuttonMousePressed

    private void _PbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__PbuttonMouseReleased
        _Pbutton.setBackground(Bchange);
    }//GEN-LAST:event__PbuttonMouseReleased

    private void _DbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__DbuttonMouseReleased
        _Dbutton.setBackground(Bchange);
    }//GEN-LAST:event__DbuttonMouseReleased

    private void _CbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__CbuttonMouseReleased
        _Cbutton.setBackground(Bchange);
    }//GEN-LAST:event__CbuttonMouseReleased
 

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    static int xx, yy;
    Color change = new Color(111, 255, 233);
    Color Bchange = new Color(43, 59, 86);
    Color Bback = new Color(28, 37, 65);    
    Color Bclick = new Color(11, 19, 43);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cicon;
    private javax.swing.JLabel Cname;
    private javax.swing.JLabel Dicon;
    private javax.swing.JLabel Dname;
    private javax.swing.JLabel Picon;
    private javax.swing.JLabel Pname;
    private javax.swing.JPanel _Cbutton;
    private javax.swing.JPanel _Dbutton;
    private javax.swing.JPanel _Pbutton;
    private javax.swing.JPanel _display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
