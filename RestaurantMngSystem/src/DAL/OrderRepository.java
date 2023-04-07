/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.OrderMenu;
import BLL.Perdoruesi;
import BLL.Ushqimet;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Arti
 */
public class OrderRepository extends EntMngClass implements OrderInterface{
     
    @Override
    public void Create(OrderMenu o) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Edit(OrderMenu o) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Delete(OrderMenu o) throws CrudFormException {
      try {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      }
    
  

   @Override
    public List<OrderMenu> FindALL() throws CrudFormException {
        try {
            return em.createNamedQuery("OrderMenu.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }

    @Override
    public OrderMenu FindByID(Integer ID) throws CrudFormException {
         try {
              Query query = em.createQuery("SELECT o FROM OrderMenu o WHERE o.orderId = :Id");
              query.setParameter("Id", ID);
              return (OrderMenu) query.getSingleResult();
          } catch (Exception e) {
              throw new CrudFormException("Msg \n"+ e.getMessage());
          }   
    }

    @Override
    public List<OrderMenu> filterOrderByName(String o) throws CrudFormException {
         try { 
              Query query = em.createQuery("SELECT o FROM OrderMenu o JOIN o.emriUshqimitId u WHERE u.emriUshqimit = :em ", Ushqimet.class);
              query.setParameter("em", o);
              return (List<OrderMenu>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        } 
    }

    @Override
    public List<OrderMenu> filterOrderByPrice(BigDecimal c) throws CrudFormException {
         try { 
              Query query = em.createQuery("SELECT o FROM OrderMenu o JOIN o.emriUshqimitId u WHERE u.cmimi = :cm ", Ushqimet.class);
              query.setParameter("cm", c);
              return (List<OrderMenu>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public List<OrderMenu> filterOrderByUser(String p) throws CrudFormException {
         try { 
              Query query = em.createQuery("SELECT o FROM OrderMenu o JOIN o.perdoruesiId u WHERE u.username = :pr ", Perdoruesi.class);
              query.setParameter("pr", p);
              return (List<OrderMenu>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public List<OrderMenu> filterOrderByTime(String s) throws CrudFormException {
          try { 
              Query query = em.createQuery("SELECT o FROM OrderMenu o WHERE o.dataEPorosis = :d");
              query.setParameter("d", s);
              return (List<OrderMenu>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public List<OrderMenu> filterOrderByToday() throws CrudFormException {
        try { 
              Date date = new Date();
              DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
              String strDate = dateFormat.format(date);
              Query query = em.createQuery("SELECT o FROM OrderMenu o WHERE o.dataEPorosis = :d");
              query.setParameter("d", strDate);
              return (List<OrderMenu>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }  
    }
    
    
       @Override
       public BigDecimal totalPrice() throws CrudFormException {
        try { 
              Query query = em.createQuery("SELECT SUM(u.cmimi) FROM OrderMenu o JOIN o.emriUshqimitId u  ", Ushqimet.class);
              return (BigDecimal)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }  
    }
          
      @Override
       public BigDecimal todayTotalPrice() throws CrudFormException {    
        try {
              Date date = new Date();
              DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
              String strDate = dateFormat.format(date);
              Query query = em.createQuery("SELECT SUM(u.cmimi) FROM OrderMenu o JOIN o.emriUshqimitId u WHERE o.dataEPorosis = :d  ", Ushqimet.class);
              query.setParameter("d", strDate);
              return (BigDecimal)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }  
    }
    
    
   

    
    
}
