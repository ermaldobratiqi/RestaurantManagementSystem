/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.OrderMenu;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Arti
 */
public interface OrderInterface {
 
    void Create(OrderMenu o) throws CrudFormException;
    void Edit(OrderMenu o) throws CrudFormException;
    void Delete(OrderMenu o)throws CrudFormException;
    List<OrderMenu> FindALL() throws CrudFormException;
    OrderMenu FindByID(Integer ID) throws CrudFormException;
    List<OrderMenu> filterOrderByName(String o) throws CrudFormException;
    List<OrderMenu> filterOrderByPrice(BigDecimal c) throws CrudFormException;
    List<OrderMenu> filterOrderByUser(String p) throws CrudFormException;
    List<OrderMenu> filterOrderByTime(String s) throws CrudFormException;
    List<OrderMenu> filterOrderByToday() throws CrudFormException;
    BigDecimal totalPrice() throws CrudFormException;
    BigDecimal todayTotalPrice() throws CrudFormException;
 
    
}
