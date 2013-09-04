/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplication3;


import javax.microedition.rms.RecordStoreNotOpenException;
import org.netbeans.microedition.lcdui.TableModel;
import org.netbeans.microedition.lcdui.TableModelListener;

/**
 *
 * @author familia_
 */
public class Tabla implements TableModel {
//int item,int talla,int cant_pares,String color,String marca,String tipo_calzado,String tipo_persona
    public void addTableModelListener(TableModelListener tl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeTableModelListener(TableModelListener tl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getColumnCount() {
       return 6;
    }

    public int getRowCount() {
        Midlet mid = new Midlet();
        try {
            return mid.rs.getNumRecords();
        } catch (RecordStoreNotOpenException ex) {
            ex.printStackTrace();
        }
        return 0;
        
    }
    public boolean isUsingHeaders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColumnName(int i) {
        switch(i){
            case 1:
                return "Item";
            case 2:
                return "Talla";
            case 3:
                return "Cantidad";
            case 4:
                return "Color";
            case 5:
                return "Marca";
            case 6:
                return "Tipo de Calzado";
            case 7:
                return "Clase de persona";
        }
        return null;
    }

    public Object getValue(int i, int j) {
        Midlet midlet = new Midlet();
        for(i = 0;i <= 6; i++){
            for(j = 0; j <= midlet.vector.size();j++){
                return midlet.vector.elementAt(i);
            }
        }
    }



    
}
