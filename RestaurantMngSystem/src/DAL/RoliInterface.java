/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Roli;
import java.util.List;

/**
 *
 * @author Arti
 */
public interface RoliInterface {
    
    void Create(Roli r) throws CrudFormException;
    void Edit(Roli r) throws CrudFormException;
    void Delete(Roli r)throws CrudFormException;
    List<Roli> FindALL() throws CrudFormException;
    Roli  FindByID(Integer ID) throws CrudFormException;
    
}
