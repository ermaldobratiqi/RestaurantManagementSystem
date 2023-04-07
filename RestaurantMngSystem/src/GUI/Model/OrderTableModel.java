
package GUI.Model;

import BLL.OrderMenu;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class OrderTableModel extends AbstractTableModel{

    List <OrderMenu> list;
    String [] cols = {"OrderID" , "EmriUshqimit","Cmimi","PorosiaKryerNga","Koha"};
    
    public OrderTableModel (){}
   
    public OrderTableModel (List<OrderMenu>list){
       this.list=list;
    }
   
    public void addList(List<OrderMenu>list){
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
    
    public OrderMenu getOrderMenu(int index){
       return list.get(index);
    
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       OrderMenu o = list.get(rowIndex);
       switch(columnIndex){
           
           case 0: return o.getOrderId();
           case 1: return o.getEmriUshqimitId().getEmriUshqimit();
           case 2: return o.getEmriUshqimitId().getCmimi();  
           case 3: return o.getPerdoruesiId().getUsername();      
           case 4: return o.getDataEPorosis();    
           default: return null;
       
       } 
    
}
}