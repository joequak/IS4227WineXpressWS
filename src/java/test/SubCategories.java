
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categories" type="{http://test.wx.com/}categories" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "subCategories", propOrder = {
    "categories",
    "id",
    "name",
    "prdtPackageCollection",
    "productCollection"
})
public class SubCategories {

    protected Categories categories;
    protected Long id;
    protected String name;
    @XmlElement(nillable = true)
    protected List<PrdtPackage> prdtPackageCollection;
    @XmlElement(nillable = true)
    protected List<Product> productCollection;

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link Categories }
     *     
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categories }
     *     
     */
    public void setCategories(Categories value) {
        this.categories = value;
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
