/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "OrderMenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderMenu.findAll", query = "SELECT o FROM OrderMenu o"),
    @NamedQuery(name = "OrderMenu.findByOrderId", query = "SELECT o FROM OrderMenu o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrderMenu.findByDataEPorosis", query = "SELECT o FROM OrderMenu o WHERE o.dataEPorosis = :dataEPorosis")})
public class OrderMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OrderId")
    private Integer orderId;
    @Column(name = "DataEPorosis")
    private String dataEPorosis;
    @JoinColumn(name = "PerdoruesiId", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Perdoruesi perdoruesiId;
    @JoinColumn(name = "EmriUshqimitId", referencedColumnName = "UshqimiId")
    @ManyToOne(optional = false)
    private Ushqimet emriUshqimitId;

    public OrderMenu() {
    }

    public OrderMenu(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getDataEPorosis() {
        return dataEPorosis;
    }

    public void setDataEPorosis(String dataEPorosis) {
        this.dataEPorosis = dataEPorosis;
    }

    public Perdoruesi getPerdoruesiId() {
        return perdoruesiId;
    }

    public void setPerdoruesiId(Perdoruesi perdoruesiId) {
        this.perdoruesiId = perdoruesiId;
    }

    public Ushqimet getEmriUshqimitId() {
        return emriUshqimitId;
    }

    public void setEmriUshqimitId(Ushqimet emriUshqimitId) {
        this.emriUshqimitId = emriUshqimitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMenu)) {
            return false;
        }
        OrderMenu other = (OrderMenu) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.OrderMenu[ orderId=" + orderId + " ]";
    }
    
}
