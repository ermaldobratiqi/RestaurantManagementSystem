/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Ushqimet;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Arti
 */
public class UshqimiTableModel extends AbstractTableModel{

    
    
    List <Ushqimet> list;
    String [] cols = {"UshqimiId" , "Emri","Cmimi","LlojiUshqimit"};
    
    public UshqimiTableModel (){}
   
    public UshqimiTableModel (List<Ushqimet>list){
       this.list=list;
    }
   
    public void addList(List<Ushqimet>list){
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
    
    public Ushqimet getUshqimet(int index){
       return list.get(index);
    
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Ushqimet u = list.get(rowIndex);
       switch(columnIndex){
           
           case 0: return u.getUshqimiId();
           case 1: return u.getEmriUshqimit();
           case 2: return u.getCmimi();   
           case 3: return u.getLlojiushqimitId();    
           default: return null;
       
       }    }
    
}
