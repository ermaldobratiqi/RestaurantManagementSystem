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
@Table(name = "LlojiUshqimit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LlojiUshqimit.findAll", query = "SELECT l FROM LlojiUshqimit l"),
    @NamedQuery(name = "LlojiUshqimit.findByLlojiUshqimitId", query = "SELECT l FROM LlojiUshqimit l WHERE l.llojiUshqimitId = :llojiUshqimitId"),
    @NamedQuery(name = "LlojiUshqimit.findByLlojiUshqimit", query = "SELECT l FROM LlojiUshqimit l WHERE l.llojiUshqimit = :llojiUshqimit")})
public class LlojiUshqimit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LlojiUshqimitId")
    private Integer llojiUshqimitId;
    @Basic(optional = false)
    @Column(name = "LlojiUshqimit")
    private String llojiUshqimit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "llojiushqimitId")
    private Collection<Ushqimet> ushqimetCollection;

    public LlojiUshqimit() {
    }

    public LlojiUshqimit(Integer llojiUshqimitId) {
        this.llojiUshqimitId = llojiUshqimitId;
    }

    public LlojiUshqimit(Integer llojiUshqimitId, String llojiUshqimit) {
        this.llojiUshqimitId = llojiUshqimitId;
        this.llojiUshqimit = llojiUshqimit;
    }

    public Integer getLlojiUshqimitId() {
        return llojiUshqimitId;
    }

    public void setLlojiUshqimitId(Integer llojiUshqimitId) {
        this.llojiUshqimitId = llojiUshqimitId;
    }

    public String getLlojiUshqimit() {
        return llojiUshqimit;
    }

    public void setLlojiUshqimit(String llojiUshqimit) {
        this.llojiUshqimit = llojiUshqimit;
    }

    @XmlTransient
    public Collection<Ushqimet> getUshqimetCollection() {
        return ushqimetCollection;
    }

    public void setUshqimetCollection(Collection<Ushqimet> ushqimetCollection) {
        this.ushqimetCollection = ushqimetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (llojiUshqimitId != null ? llojiUshqimitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LlojiUshqimit)) {
            return false;
        }
        LlojiUshqimit other = (LlojiUshqimit) object;
        if ((this.llojiUshqimitId == null && other.llojiUshqimitId != null) || (this.llojiUshqimitId != null && !this.llojiUshqimitId.equals(other.llojiUshqimitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return llojiUshqimit;
    }
    
}
