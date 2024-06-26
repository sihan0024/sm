/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package supermarket;

import javax.swing.DefaultCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class QtyCell extends DefaultCellEditor{
    private JSpinner input;
    
    public QtyCell() {
        super(new JTextField());
        input = new JSpinner();
    }
    
}
    
 
