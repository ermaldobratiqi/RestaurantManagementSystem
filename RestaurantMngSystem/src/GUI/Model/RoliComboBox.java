/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;


import BLL.Roli;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Arti
 */
public class RoliComboBox  extends AbstractListModel<Roli> implements ComboBoxModel<Roli>{

   private List<Roli> lista;
    private Roli Selected;
    
    public RoliComboBox(){}
    
    public RoliComboBox(List<Roli> lista){ 
        this.lista=lista;
    }
    
     public void add(List<Roli> lista){ 
        this.lista=lista;
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        Selected = (Roli)anItem;
    }

    @Override
    public Object getSelectedItem() {
       return Selected;
    }

    @Override
    public int getSize() {
        return lista.size();
    
    }

    @Override
    public Roli getElementAt(int index) {
          
        return lista.get(index);
    
    }

   

  
    
}
