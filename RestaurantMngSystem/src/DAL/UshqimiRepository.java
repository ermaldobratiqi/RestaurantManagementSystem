/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.LlojiUshqimit;
import BLL.Ushqimet;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Arti
 */
public class UshqimiRepository extends EntMngClass implements UshqimiInterface{

    @Override
    public void Create(Ushqimet u) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Edit(Ushqimet u) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Delete(Ushqimet u) throws CrudFormException {
      try {
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      }

    @Override
    public List<Ushqimet> FindALL() throws CrudFormException {
        try {
            return em.createNamedQuery("Ushqimet.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }
    @Override
    public List<Ushqimet> FindMain() throws CrudFormException {
        try { 
              Query query = em.createQuery("SELECT e FROM Ushqimet e JOIN e.llojiushqimitId ll WHERE ll.llojiUshqimitId LIKE '1%'", LlojiUshqimit.class);
              return (List<Ushqimet>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }
    @Override
    public List<Ushqimet> FindDrinks() throws CrudFormException {
        try { 
              Query query = em.createQuery("SELECT e FROM Ushqimet e JOIN e.llojiushqimitId ll WHERE ll.llojiUshqimitId LIKE '2%'", LlojiUshqimit.class);
              return (List<Ushqimet>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }
    @Override
     public List<Ushqimet> FindAlcohol() throws CrudFormException {
        try { 
              Query query = em.createQuery("SELECT e FROM Ushqimet e JOIN e.llojiushqimitId ll WHERE ll.llojiUshqimitId LIKE '3%'", LlojiUshqimit.class);
              return (List<Ushqimet>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }
     @Override
      public List<Ushqimet> FindDessert() throws CrudFormException {
        try { 
              Query query = em.createQuery("SELECT e FROM Ushqimet e JOIN e.llojiushqimitId ll WHERE ll.llojiUshqimitId LIKE '4%'", LlojiUshqimit.class);
              return (List<Ushqimet>) query.getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }

    @Override
    public Ushqimet FindByID(Integer ID) throws CrudFormException {
         try {
              Query query = em.createQuery("SELECT u FROM Ushqimet u WHERE u.ushqimiId = :ushqimiId");
              query.setParameter("ushqimiId", ID);
              return (Ushqimet) query.getSingleResult();
          } catch (Exception e) {
              throw new CrudFormException("Msg \n"+ e.getMessage());
          }   
    }
    
}
