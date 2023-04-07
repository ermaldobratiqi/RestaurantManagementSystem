/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Perdoruesi;
import java.util.List;


/**
 *
 * @author Acer
 */
public interface PerdoruesiInterface {
    
    void Create(Perdoruesi p) throws CrudFormException;
    void Edit(Perdoruesi p) throws CrudFormException;
    void Delete(Perdoruesi p)throws CrudFormException;
    List<Perdoruesi> FindALL() throws CrudFormException;
    Perdoruesi  FindByID(Integer ID) throws CrudFormException;
    Perdoruesi loginByUsernameAndPassword(String u,String p) throws CrudFormException;
    


}
