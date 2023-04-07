/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Roli")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roli.findAll", query = "SELECT r FROM Roli r"),
    @NamedQuery(name = "Roli.findById", query = "SELECT r FROM Roli r WHERE r.id = :id"),
    @NamedQuery(name = "Roli.findByEmertimi", query = "SELECT r FROM Roli r WHERE r.emertimi = :emertimi")})
public class Roli implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Emertimi")
    private String emertimi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roliID")
    private Collection<Perdoruesi> perdoruesiCollection;

    public Roli() {
    }

    public Roli(Integer id) {
        this.id = id;
    }

    public Roli(Integer id, String emertimi) {
        this.id = id;
        this.emertimi = emertimi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmertimi() {
        return emertimi;
    }

    public void setEmertimi(String emertimi) {
        this.emertimi = emertimi;
    }

    @XmlTransient
    public Collection<Perdoruesi> getPerdoruesiCollection() {
        return perdoruesiCollection;
    }

    public void setPerdoruesiCollection(Collection<Perdoruesi> perdoruesiCollection) {
        this.perdoruesiCollection = perdoruesiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roli)) {
            return false;
        }
        Roli other = (Roli) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emertimi;
    }
    
}
