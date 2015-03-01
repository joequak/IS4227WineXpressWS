
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminUsr" type="{http://test.wx.com/}adminUsr" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://test.wx.com/}customer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prdtPackage" type="{http://test.wx.com/}prdtPackage" minOccurs="0"/>
 *         &lt;element name="product" type="{http://test.wx.com/}product" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comment", propOrder = {
    "adminUsr",
    "comment",
    "customer",
    "id",
    "prdtPackage",
    "product"
})
public class Comment {

    protected AdminUsr adminUsr;
    protected String comment;
    protected Customer customer;
    protected Long id;
    protected PrdtPackage prdtPackage;
    protected Product product;

    /**
     * Gets the value of the adminUsr property.
     * 
     * @return
     *     possible object is
     *     {@link AdminUsr }
     *     
     */
    public AdminUsr getAdminUsr() {
        return adminUsr;
    }

    /**
     * Sets the value of the adminUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminUsr }
     *     
     */
    public void setAdminUsr(AdminUsr value) {
        this.adminUsr = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

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
     * Gets the value of the prdtPackage property.
     * 
     * @return
     *     possible object is
     *     {@link PrdtPackage }
     *     
     */
    public PrdtPackage getPrdtPackage() {
        return prdtPackage;
    }

    /**
     * Sets the value of the prdtPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrdtPackage }
     *     
     */
    public void setPrdtPackage(PrdtPackage value) {
        this.prdtPackage = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}
