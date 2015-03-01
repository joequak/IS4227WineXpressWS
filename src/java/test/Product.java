
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="averageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="categoriesCollection" type="{http://test.wx.com/}categories" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commentCollection" type="{http://test.wx.com/}comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderItemsCollection" type="{http://test.wx.com/}orderItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prdtPackageCollection" type="{http://test.wx.com/}prdtPackage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rateCollection" type="{http://test.wx.com/}rate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soldQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subCategoriesCollection" type="{http://test.wx.com/}subCategories" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="volumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="watchlistCollection" type="{http://test.wx.com/}watchlist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "availableQuantity",
    "averageRate",
    "categoriesCollection",
    "commentCollection",
    "description",
    "discount",
    "id",
    "name",
    "numberOfRate",
    "orderItemsCollection",
    "picture",
    "prdtPackageCollection",
    "price",
    "rateCollection",
    "soldQuantity",
    "subCategoriesCollection",
    "volumn",
    "watchlistCollection"
})
public class Product {

    protected Integer availableQuantity;
    protected Double averageRate;
    @XmlElement(nillable = true)
    protected List<Categories> categoriesCollection;
    @XmlElement(nillable = true)
    protected List<Comment> commentCollection;
    protected String description;
    protected Integer discount;
    protected Long id;
    protected String name;
    protected String numberOfRate;
    @XmlElement(nillable = true)
    protected List<OrderItems> orderItemsCollection;
    protected String picture;
    @XmlElement(nillable = true)
    protected List<PrdtPackage> prdtPackageCollection;
    protected Double price;
    @XmlElement(nillable = true)
    protected List<Rate> rateCollection;
    protected Integer soldQuantity;
    @XmlElement(nillable = true)
    protected List<SubCategories> subCategoriesCollection;
    protected String volumn;
    @XmlElement(nillable = true)
    protected List<Watchlist> watchlistCollection;

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableQuantity(Integer value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageRate(Double value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the categoriesCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriesCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriesCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Categories }
     * 
     * 
     */
    public List<Categories> getCategoriesCollection() {
        if (categoriesCollection == null) {
            categoriesCollection = new ArrayList<Categories>();
        }
        return this.categoriesCollection;
    }

    /**
     * Gets the value of the commentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getCommentCollection() {
        if (commentCollection == null) {
            commentCollection = new ArrayList<Comment>();
        }
        return this.commentCollection;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscount(Integer value) {
        this.discount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numberOfRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRate() {
        return numberOfRate;
    }

    /**
     * Sets the value of the numberOfRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRate(String value) {
        this.numberOfRate = value;
    }

    /**
     * Gets the value of the orderItemsCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemsCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemsCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItems }
     * 
     * 
     */
    public List<OrderItems> getOrderItemsCollection() {
        if (orderItemsCollection == null) {
            orderItemsCollection = new ArrayList<OrderItems>();
        }
        return this.orderItemsCollection;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Gets the value of the prdtPackageCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdtPackageCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdtPackageCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrdtPackage }
     * 
     * 
     */
    public List<PrdtPackage> getPrdtPackageCollection() {
        if (prdtPackageCollection == null) {
            prdtPackageCollection = new ArrayList<PrdtPackage>();
        }
        return this.prdtPackageCollection;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the rateCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate }
     * 
     * 
     */
    public List<Rate> getRateCollection() {
        if (rateCollection == null) {
            rateCollection = new ArrayList<Rate>();
        }
        return this.rateCollection;
    }

    /**
     * Gets the value of the soldQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    /**
     * Sets the value of the soldQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoldQuantity(Integer value) {
        this.soldQuantity = value;
    }

    /**
     * Gets the value of the subCategoriesCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCategoriesCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCategoriesCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCategories }
     * 
     * 
     */
    public List<SubCategories> getSubCategoriesCollection() {
        if (subCategoriesCollection == null) {
            subCategoriesCollection = new ArrayList<SubCategories>();
        }
        return this.subCategoriesCollection;
    }

    /**
     * Gets the value of the volumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumn() {
        return volumn;
    }

    /**
     * Sets the value of the volumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumn(String value) {
        this.volumn = value;
    }

    /**
     * Gets the value of the watchlistCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watchlistCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatchlistCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Watchlist }
     * 
     * 
     */
    public List<Watchlist> getWatchlistCollection() {
        if (watchlistCollection == null) {
            watchlistCollection = new ArrayList<Watchlist>();
        }
        return this.watchlistCollection;
    }

}
