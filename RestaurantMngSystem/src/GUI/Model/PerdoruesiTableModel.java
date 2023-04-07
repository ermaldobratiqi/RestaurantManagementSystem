/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Perdoruesi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Arti
 */
public class PerdoruesiTableModel extends AbstractTableModel {

     List <Perdoruesi> list;
    String [] cols = {"ID" , "Username","Password","Roli"};
    
    public PerdoruesiTableModel (){}
   
    public PerdoruesiTableModel (List<Perdoruesi>list){
       this.list=list;
    }
   
    public void addList(List<Perdoruesi>list){
       this.list=list;
    }
   
    @Override
     public String getColumnName(int col){
       return cols[col];
    }
     
    
    @Override
    public int getRowCount() {
       return list.size();
    }
    
    public void remove(int row){
       list.remove(row);
    }
    
    public Perdoruesi getUshqimet(int index){
       return list.get(index);
    
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Perdoruesi p = list.get(rowIndex);
       switch(columnIndex){
           
           case 0: return p.getId();
           case 1: return p.getUsername();
           case 2: return p.getPassword();   
           case 3: return p.getRoliID();    
           default: return null;
       
       }    }
    
    
    
    
    
}
