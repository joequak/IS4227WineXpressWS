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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ¿.¿.¿
 */
@Entity
@Table(name = "Product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
    @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description"),
    @NamedQuery(name = "Product.findByAvailableQuantity", query = "SELECT p FROM Product p WHERE p.availableQuantity = :availableQuantity"),
    @NamedQuery(name = "Product.findBySoldQuantity", query = "SELECT p FROM Product p WHERE p.soldQuantity = :soldQuantity"),
    @NamedQuery(name = "Product.findByAverageRate", query = "SELECT p FROM Product p WHERE p.averageRate = :averageRate"),
    @NamedQuery(name = "Product.findByPicture", query = "SELECT p FROM Product p WHERE p.picture = :picture"),
    @NamedQuery(name = "Product.findByDiscount", query = "SELECT p FROM Product p WHERE p.discount = :discount"),
    @NamedQuery(name = "Product.findByVolumn", query = "SELECT p FROM Product p WHERE p.volumn = :volumn")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    @Column(name = "name", length = 200)
    private String name;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    
    @Column(name = "description", length = 1000)
    private String description;
    
    @Column(name = "availableQuantity")
    private Integer availableQuantity;
    
    @Column(name = "soldQuantity")
    private Integer soldQuantity;
    
    @Column(name = "averageRate")
    private Double averageRate;
    
    @Column(name = "picture", length = 500)
    private String picture;
    
    @Column(name = "discount")
    private Integer discount;
    
    @Column(name = "numberOfRate", length = 16777215)
    private String numberOfRate;
    
    @Column(name = "volumn", length = 45)
    private String volumn;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private Collection<PrdtPackage> prdtPackageCollection;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "product")
    private Collection<Comment> commentCollection;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "product")
    private Collection<Rate> rateCollection;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private Collection<Categories> categoriesCollection;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private Collection<SubCategories> subCategoriesCollection;
    
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "productCollection")
    private Collection<Watchlist> watchlistCollection;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "product")
    private Collection<OrderItems> orderItemsCollection;
    
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Product[ id=" + id + " ]";
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
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the availableQuantity
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * @param availableQuantity the availableQuantity to set
     */
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /**
     * @return the soldQuantity
     */
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    /**
     * @param soldQuantity the soldQuantity to set
     */
    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    /**
     * @return the averageRate
     */
    public Double getAverageRate() {
        return averageRate;
    }

    /**
     * @param averageRate the averageRate to set
     */
    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return the discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * @return the numberOfRate
     */
    public String getNumberOfRate() {
        return numberOfRate;
    }

    /**
     * @param numberOfRate the numberOfRate to set
     */
    public void setNumberOfRate(String numberOfRate) {
        this.numberOfRate = numberOfRate;
    }

    /**
     * @return the volumn
     */
    public String getVolumn() {
        return volumn;
    }

    /**
     * @param volumn the volumn to set
     */
    public void setVolumn(String volumn) {
        this.volumn = volumn;
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

    /**
     * @return the commentCollection
     */
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    /**
     * @param commentCollection the commentCollection to set
     */
    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    /**
     * @return the rateCollection
     */
    public Collection<Rate> getRateCollection() {
        return rateCollection;
    }

    /**
     * @param rateCollection the rateCollection to set
     */
    public void setRateCollection(Collection<Rate> rateCollection) {
        this.rateCollection = rateCollection;
    }

    /**
     * @return the categoriesCollection
     */
    public Collection<Categories> getCategoriesCollection() {
        return categoriesCollection;
    }

    /**
     * @param categoriesCollection the categoriesCollection to set
     */
    public void setCategoriesCollection(Collection<Categories> categoriesCollection) {
        this.categoriesCollection = categoriesCollection;
    }

    /**
     * @return the subCategoriesCollection
     */
    public Collection<SubCategories> getSubCategoriesCollection() {
        return subCategoriesCollection;
    }

    /**
     * @param subCategoriesCollection the subCategoriesCollection to set
     */
    public void setSubCategoriesCollection(Collection<SubCategories> subCategoriesCollection) {
        this.subCategoriesCollection = subCategoriesCollection;
    }

    /**
     * @return the watchlistCollection
     */
    public Collection<Watchlist> getWatchlistCollection() {
        return watchlistCollection;
    }

    /**
     * @param watchlistCollection the watchlistCollection to set
     */
    public void setWatchlistCollection(Collection<Watchlist> watchlistCollection) {
        this.watchlistCollection = watchlistCollection;
    }

    /**
     * @return the orderItemsCollection
     */
    public Collection<OrderItems> getOrderItemsCollection() {
        return orderItemsCollection;
    }

    /**
     * @param orderItemsCollection the orderItemsCollection to set
     */
    public void setOrderItemsCollection(Collection<OrderItems> orderItemsCollection) {
        this.orderItemsCollection = orderItemsCollection;
    }
    
}
