/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Ushqimet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ushqimet.findAll", query = "SELECT u FROM Ushqimet u"),
    @NamedQuery(name = "Ushqimet.findByUshqimiId", query = "SELECT u FROM Ushqimet u WHERE u.ushqimiId = :ushqimiId"),
    @NamedQuery(name = "Ushqimet.findByEmriUshqimit", query = "SELECT u FROM Ushqimet u WHERE u.emriUshqimit = :emriUshqimit"),
    @NamedQuery(name = "Ushqimet.findByCmimi", query = "SELECT u FROM Ushqimet u WHERE u.cmimi = :cmimi")})
public class Ushqimet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UshqimiId")
    private Integer ushqimiId;
    @Basic(optional = false)
    @Column(name = "EmriUshqimit")
    private String emriUshqimit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Cmimi")
    private BigDecimal cmimi;
    @JoinColumn(name = "LlojiushqimitId", referencedColumnName = "LlojiUshqimitId")
    @ManyToOne(optional = false)
    private LlojiUshqimit llojiushqimitId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emriUshqimitId")
    private Collection<OrderMenu> orderMenuCollection;

    public Ushqimet() {
    }

    public Ushqimet(Integer ushqimiId) {
        this.ushqimiId = ushqimiId;
    }

    public Ushqimet(Integer ushqimiId, String emriUshqimit, BigDecimal cmimi) {
        this.ushqimiId = ushqimiId;
        this.emriUshqimit = emriUshqimit;
        this.cmimi = cmimi;
    }

    public Integer getUshqimiId() {
        return ushqimiId;
    }

    public void setUshqimiId(Integer ushqimiId) {
        this.ushqimiId = ushqimiId;
    }

    public String getEmriUshqimit() {
        return emriUshqimit;
    }

    public void setEmriUshqimit(String emriUshqimit) {
        this.emriUshqimit = emriUshqimit;
    }

    public BigDecimal getCmimi() {
        return cmimi;
    }

    public void setCmimi(BigDecimal cmimi) {
        this.cmimi = cmimi;
    }

    public LlojiUshqimit getLlojiushqimitId() {
        return llojiushqimitId;
    }

    public void setLlojiushqimitId(LlojiUshqimit llojiushqimitId) {
        this.llojiushqimitId = llojiushqimitId;
    }

    @XmlTransient
    public Collection<OrderMenu> getOrderMenuCollection() {
        return orderMenuCollection;
    }

    public void setOrderMenuCollection(Collection<OrderMenu> orderMenuCollection) {
        this.orderMenuCollection = orderMenuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ushqimiId != null ? ushqimiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ushqimet)) {
            return false;
        }
        Ushqimet other = (Ushqimet) object;
        if ((this.ushqimiId == null && other.ushqimiId != null) || (this.ushqimiId != null && !this.ushqimiId.equals(other.ushqimiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Ushqimet[ ushqimiId=" + ushqimiId + " ]";
    }
    
}
