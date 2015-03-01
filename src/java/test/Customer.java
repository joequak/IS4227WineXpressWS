
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billToAdressCollection" type="{http://test.wx.com/}billToAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commentCollection" type="{http://test.wx.com/}comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditCardCollection" type="{http://test.wx.com/}creditCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fistName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderDetailid" type="{http://test.wx.com/}orderDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCollection" type="{http://test.wx.com/}rate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipToAddressCollection" type="{http://test.wx.com/}shipToAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "customer", propOrder = {
    "billToAdressCollection",
    "commentCollection",
    "creditCardCollection",
    "email",
    "fistName",
    "id",
    "lastName",
    "orderDetailid",
    "password",
    "rateCollection",
    "shipToAddressCollection",
    "status",
    "watchlistCollection"
})
public class Customer {

    @XmlElement(nillable = true)
    protected List<BillToAddress> billToAdressCollection;
    @XmlElement(nillable = true)
    protected List<Comment> commentCollection;
    @XmlElement(nillable = true)
    protected List<CreditCard> creditCardCollection;
    protected String email;
    protected String fistName;
    protected Long id;
    protected String lastName;
    @XmlElement(nillable = true)
    protected List<OrderDetail> orderDetailid;
    protected String password;
    @XmlElement(nillable = true)
    protected List<Rate> rateCollection;
    @XmlElement(nillable = true)
    protected List<ShipToAddress> shipToAddressCollection;
    protected Boolean status;
    @XmlElement(nillable = true)
    protected List<Watchlist> watchlistCollection;

    /**
     * Gets the value of the billToAdressCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billToAdressCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillToAdressCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillToAddress }
     * 
     * 
     */
    public List<BillToAddress> getBillToAdressCollection() {
        if (billToAdressCollection == null) {
            billToAdressCollection = new ArrayList<BillToAddress>();
        }
        return this.billToAdressCollection;
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
     * Gets the value of the creditCardCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCard }
     * 
     * 
     */
    public List<CreditCard> getCreditCardCollection() {
        if (creditCardCollection == null) {
            creditCardCollection = new ArrayList<CreditCard>();
        }
        return this.creditCardCollection;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * Sets the value of the fistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFistName(String value) {
        this.fistName = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the orderDetailid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDetailid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDetailid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderDetail }
     * 
     * 
     */
    public List<OrderDetail> getOrderDetailid() {
        if (orderDetailid == null) {
            orderDetailid = new ArrayList<OrderDetail>();
        }
        return this.orderDetailid;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the shipToAddressCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToAddressCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToAddressCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipToAddress }
     * 
     * 
     */
    public List<ShipToAddress> getShipToAddressCollection() {
        if (shipToAddressCollection == null) {
            shipToAddressCollection = new ArrayList<ShipToAddress>();
        }
        return this.shipToAddressCollection;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
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
