/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.LlojiUshqimit;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author
 */
public class LlojiUshqimitRepository extends EntMngClass implements LlojiUshqimitInterface{

    
    @Override
    public void Create(LlojiUshqimit ll) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(ll);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Edit(LlojiUshqimit ll) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(ll);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }    }

    @Override
    public void Delete(LlojiUshqimit ll) throws CrudFormException {
      try {
            em.getTransaction().begin();
            em.remove(ll);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      }
    
  

   @Override
    public List<LlojiUshqimit> FindALL() throws CrudFormException {
        try {
            return em.createNamedQuery("LlojiUshqimit.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+ e.getMessage());
        }      
    }

    @Override
    public LlojiUshqimit FindByID(Integer ID) throws CrudFormException {
         try {
              Query query = em.createQuery("SELECT u FROM Ushqimet u WHERE u.llojiushqimitId = :Id");
              query.setParameter("Id", ID);
              return (LlojiUshqimit) query.getSingleResult();
          } catch (Exception e) {
              throw new CrudFormException("Msg \n"+ e.getMessage());
          }   
    }
    
}
