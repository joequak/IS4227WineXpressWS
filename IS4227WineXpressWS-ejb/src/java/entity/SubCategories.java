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
public class SubCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name", length = 100)
    private String name;
    
    @ManyToOne
    private Categories categories;
    
    @ManyToMany (cascade = {CascadeType.ALL}, mappedBy = "subCategoriesCollection")
    private Collection<Product> productCollection;
    
    @ManyToMany (cascade = {CascadeType.ALL}, mappedBy = "subCategoriesCollection")
    private Collection<PrdtPackage> prdtPackageCollection;

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
        if (!(object instanceof SubCategories)) {
            return false;
        }
        SubCategories other = (SubCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SubCategories[ id=" + id + " ]";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the categories
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Categories categories) {
        this.categories = categories;
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
