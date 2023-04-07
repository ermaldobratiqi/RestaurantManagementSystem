/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.LlojiUshqimit;
import java.util.List;


public interface LlojiUshqimitInterface {
     void Create(LlojiUshqimit ll) throws CrudFormException;
    void Edit(LlojiUshqimit ll) throws CrudFormException;
    void Delete(LlojiUshqimit ll)throws CrudFormException;
    List<LlojiUshqimit> FindALL() throws CrudFormException;
    LlojiUshqimit FindByID(Integer ID) throws CrudFormException;
}
