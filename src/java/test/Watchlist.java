
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchlist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="watchlist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://test.wx.com/}customer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="liked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prdtPackageCollection" type="{http://test.wx.com/}prdtPackage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productCollection" type="{http://test.wx.com/}product" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchlist", propOrder = {
    "customer",
    "id",
    "liked",
    "prdtPackageCollection",
    "productCollection"
})
public class Watchlist {

    protected Customer customer;
    protected Long id;
    protected Boolean liked;
    @XmlElement(nillable = true)
    protected List<PrdtPackage> prdtPackageCollection;
    @XmlElement(nillable = true)
    protected List<Product> productCollection;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
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
     * Gets the value of the liked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiked() {
        return liked;
    }

    /**
     * Sets the value of the liked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiked(Boolean value) {
        this.liked = value;
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
     * Gets the value of the productCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProductCollection() {
        if (productCollection == null) {
            productCollection = new ArrayList<Product>();
        }
        return this.productCollection;
    }

}
