
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://test.wx.com/}customer" minOccurs="0"/>
 *         &lt;element name="discountedPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ordDate" type="{http://test.wx.com/}timestamp" minOccurs="0"/>
 *         &lt;element name="orderItemsCollection" type="{http://test.wx.com/}orderItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://test.wx.com/}payment" minOccurs="0"/>
 *         &lt;element name="priceBeforeDisc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sContactNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDetail", propOrder = {
    "contactName",
    "contactNumber",
    "currency",
    "customer",
    "discountedPrice",
    "id",
    "ordDate",
    "orderItemsCollection",
    "payment",
    "priceBeforeDisc",
    "shippingFee",
    "status",
    "totalPrice",
    "dAddress1",
    "dAddress2",
    "dCity",
    "dContact",
    "dCountry",
    "dPostalCode",
    "dState",
    "sAddress1",
    "sAddress2",
    "sCity",
    "sContactNum",
    "sCountry",
    "sPostalCode",
    "sState"
})
public class OrderDetail {

    protected String contactName;
    protected String contactNumber;
    protected String currency;
    protected Customer customer;
    protected Double discountedPrice;
    protected Long id;
    protected Timestamp ordDate;
    @XmlElement(nillable = true)
    protected List<OrderItems> orderItemsCollection;
    protected Payment payment;
    protected Double priceBeforeDisc;
    protected Double shippingFee;
    protected String status;
    protected Double totalPrice;
    protected String dAddress1;
    protected String dAddress2;
    protected String dCity;
    protected String dContact;
    protected String dCountry;
    protected String dPostalCode;
    protected String dState;
    protected String sAddress1;
    protected String sAddress2;
    protected String sCity;
    protected String sContactNum;
    protected String sCountry;
    protected String sPostalCode;
    protected String sState;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the discountedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountedPrice() {
        return discountedPrice;
    }

    /**
     * Sets the value of the discountedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountedPrice(Double value) {
        this.discountedPrice = value;
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
     * Gets the value of the ordDate property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getOrdDate() {
        return ordDate;
    }

    /**
     * Sets the value of the ordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setOrdDate(Timestamp value) {
        this.ordDate = value;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the priceBeforeDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceBeforeDisc() {
        return priceBeforeDisc;
    }

    /**
     * Sets the value of the priceBeforeDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceBeforeDisc(Double value) {
        this.priceBeforeDisc = value;
    }

    /**
     * Gets the value of the shippingFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingFee() {
        return shippingFee;
    }

    /**
     * Sets the value of the shippingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingFee(Double value) {
        this.shippingFee = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPrice(Double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the dAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAddress1() {
        return dAddress1;
    }

    /**
     * Sets the value of the dAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAddress1(String value) {
        this.dAddress1 = value;
    }

    /**
     * Gets the value of the dAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAddress2() {
        return dAddress2;
    }

    /**
     * Sets the value of the dAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAddress2(String value) {
        this.dAddress2 = value;
    }

    /**
     * Gets the value of the dCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCity() {
        return dCity;
    }

    /**
     * Sets the value of the dCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCity(String value) {
        this.dCity = value;
    }

    /**
     * Gets the value of the dContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDContact() {
        return dContact;
    }

    /**
     * Sets the value of the dContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDContact(String value) {
        this.dContact = value;
    }

    /**
     * Gets the value of the dCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCountry() {
        return dCountry;
    }

    /**
     * Sets the value of the dCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCountry(String value) {
        this.dCountry = value;
    }

    /**
     * Gets the value of the dPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPostalCode() {
        return dPostalCode;
    }

    /**
     * Sets the value of the dPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPostalCode(String value) {
        this.dPostalCode = value;
    }

    /**
     * Gets the value of the dState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDState() {
        return dState;
    }

    /**
     * Sets the value of the dState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDState(String value) {
        this.dState = value;
    }

    /**
     * Gets the value of the sAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAddress1() {
        return sAddress1;
    }

    /**
     * Sets the value of the sAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAddress1(String value) {
        this.sAddress1 = value;
    }

    /**
     * Gets the value of the sAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAddress2() {
        return sAddress2;
    }

    /**
     * Sets the value of the sAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAddress2(String value) {
        this.sAddress2 = value;
    }

    /**
     * Gets the value of the sCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCity() {
        return sCity;
    }

    /**
     * Sets the value of the sCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCity(String value) {
        this.sCity = value;
    }

    /**
     * Gets the value of the sContactNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContactNum() {
        return sContactNum;
    }

    /**
     * Sets the value of the sContactNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContactNum(String value) {
        this.sContactNum = value;
    }

    /**
     * Gets the value of the sCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountry() {
        return sCountry;
    }

    /**
     * Sets the value of the sCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountry(String value) {
        this.sCountry = value;
    }

    /**
     * Gets the value of the sPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPostalCode() {
        return sPostalCode;
    }

    /**
     * Sets the value of the sPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPostalCode(String value) {
        this.sPostalCode = value;
    }

    /**
     * Gets the value of the sState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSState() {
        return sState;
    }

    /**
     * Sets the value of the sState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSState(String value) {
        this.sState = value;
    }

}
