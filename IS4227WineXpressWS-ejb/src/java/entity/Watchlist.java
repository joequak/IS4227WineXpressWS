/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author ¿.¿.¿
 */
@Entity
public class Watchlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "liked")
    private Boolean liked;
    
    @ManyToMany (cascade = {CascadeType.ALL})
    private Collection<Product> productCollection;
    
    @ManyToMany (cascade = {CascadeType.ALL})
    private Collection<PrdtPackage> prdtPackageCollection;
    
    @ManyToOne
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Watchlist)) {
            return false;
        }
        Watchlist other = (Watchlist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Watchlist[ id=" + id + " ]";
    }

    /**
     * @return the liked
     */
    public Boolean getLiked() {
        return liked;
    }

    /**
     * @param liked the liked to set
     */
    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    /**
     * @return the productCollection
     */
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    /**
     * @param productCollection the productCollection to set
     */
    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the prdtPackageCollection
     */
    public Collection<PrdtPackage> getPrdtPackageCollection() {
        return prdtPackageCollection;
    }

    /**
     * @param prdtPackageCollection the prdtPackageCollection to set
     */
    public void setPrdtPackageCollection(Collection<PrdtPackage> prdtPackageCollection) {
        this.prdtPackageCollection = prdtPackageCollection;
    }
    
}
