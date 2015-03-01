
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderDetail" type="{http://test.wx.com/}orderDetail" minOccurs="0"/>
 *         &lt;element name="payDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "amount",
    "cardHolder",
    "cardNumber",
    "id",
    "method",
    "orderDetail",
    "payDay"
})
public class Payment {

    protected double amount;
    protected String cardHolder;
    protected int cardNumber;
    protected Long id;
    protected String method;
    protected OrderDetail orderDetail;
    protected String payDay;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     */
    public void setCardNumber(int value) {
        this.cardNumber = value;
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
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetail }
     *     
     */
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetail }
     *     
     */
    public void setOrderDetail(OrderDetail value) {
        this.orderDetail = value;
    }

    /**
     * Gets the value of the payDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDay() {
        return payDay;
    }

    /**
     * Sets the value of the payDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDay(String value) {
        this.payDay = value;
    }

}
