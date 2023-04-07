
package GUI.Model;

import BLL.LlojiUshqimit;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.AbstractListModel;


public class LlojiUshqimitComboBox extends AbstractListModel<LlojiUshqimit> implements ComboBoxModel<LlojiUshqimit>{

    private List<LlojiUshqimit> Lloji;
    private LlojiUshqimit Selected;
    
    public LlojiUshqimitComboBox(){}
    
    public LlojiUshqimitComboBox(List<LlojiUshqimit> Lloji){ 
        this.Lloji=Lloji;
    }
    
     public void add(List<LlojiUshqimit> Lloji){ 
        this.Lloji=Lloji;
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        Selected = (LlojiUshqimit)anItem;
    }

    @Override
    public Object getSelectedItem() {
       return Selected;
    }

    @Override
    public int getSize() {
        return Lloji.size();
    
    }

    @Override
    public LlojiUshqimit getElementAt(int index) {
          
        return Lloji.get(index);
    
    }

  
    
   
    
    
}
