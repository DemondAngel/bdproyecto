/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gallegosr
 */
 

public class RowsRenderer extends DefaultTableCellRenderer {
private int columna ;

public RowsRenderer(int Colpatron)
{
    this.columna = Colpatron;
}

@Override
public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
{        
    setBackground(new Color(58,80,107));
    table.setForeground(Color.WHITE);
    super.getTableCellRendererComponent(table, value, selected, focused, row, column);
    if(table.getValueAt(row,columna).equals("0"))
    {
       this.setBackground(new Color(32,56,100));
    }
    return this;
  }
  }
