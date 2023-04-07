/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Ushqimet;
import java.util.List;

/**
 *
 * @author Arti
 */
public interface UshqimiInterface {
    void Create(Ushqimet u) throws CrudFormException;
    void Edit(Ushqimet u) throws CrudFormException;
    void Delete(Ushqimet u)throws CrudFormException;
    List<Ushqimet> FindALL() throws CrudFormException;
    Ushqimet FindByID(Integer ID) throws CrudFormException;
    List<Ushqimet> FindMain() throws CrudFormException;
    List<Ushqimet> FindDrinks() throws CrudFormException;
    List<Ushqimet> FindAlcohol() throws CrudFormException;
    List<Ushqimet> FindDessert() throws CrudFormException;
    
}
