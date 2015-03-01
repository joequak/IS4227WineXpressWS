
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestResponse_QNAME = new QName("http://test.wx.com/", "testResponse");
    private final static QName _WriteTest_QNAME = new QName("http://test.wx.com/", "writeTest");
    private final static QName _ReadTestResponse_QNAME = new QName("http://test.wx.com/", "readTestResponse");
    private final static QName _ReadTest_QNAME = new QName("http://test.wx.com/", "readTest");
    private final static QName _WriteTestResponse_QNAME = new QName("http://test.wx.com/", "writeTestResponse");
    private final static QName _Test_QNAME = new QName("http://test.wx.com/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadTest }
     * 
     */
    public ReadTest createReadTest() {
        return new ReadTest();
    }

    /**
     * Create an instance of {@link WriteTestResponse }
     * 
     */
    public WriteTestResponse createWriteTestResponse() {
        return new WriteTestResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link WriteTest }
     * 
     */
    public WriteTest createWriteTest() {
        return new WriteTest();
    }

    /**
     * Create an instance of {@link ReadTestResponse }
     * 
     */
    public ReadTestResponse createReadTestResponse() {
        return new ReadTestResponse();
    }

    /**
     * Create an instance of {@link ShipToAddress }
     * 
     */
    public ShipToAddress createShipToAddress() {
        return new ShipToAddress();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link OrderItems }
     * 
     */
    public OrderItems createOrderItems() {
        return new OrderItems();
    }

    /**
     * Create an instance of {@link SubCategories }
     * 
     */
    public SubCategories createSubCategories() {
        return new SubCategories();
    }

    /**
     * Create an instance of {@link PrdtPackage }
     * 
     */
    public PrdtPackage createPrdtPackage() {
        return new PrdtPackage();
    }

    /**
     * Create an instance of {@link BillToAddress }
     * 
     */
    public BillToAddress createBillToAddress() {
        return new BillToAddress();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link AdminUsr }
     * 
     */
    public AdminUsr createAdminUsr() {
        return new AdminUsr();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link OrderDetail }
     * 
     */
    public OrderDetail createOrderDetail() {
        return new OrderDetail();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Categories }
     * 
     */
    public Categories createCategories() {
        return new Categories();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link Watchlist }
     * 
     */
    public Watchlist createWatchlist() {
        return new Watchlist();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "writeTest")
    public JAXBElement<WriteTest> createWriteTest(WriteTest value) {
        return new JAXBElement<WriteTest>(_WriteTest_QNAME, WriteTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "readTestResponse")
    public JAXBElement<ReadTestResponse> createReadTestResponse(ReadTestResponse value) {
        return new JAXBElement<ReadTestResponse>(_ReadTestResponse_QNAME, ReadTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "readTest")
    public JAXBElement<ReadTest> createReadTest(ReadTest value) {
        return new JAXBElement<ReadTest>(_ReadTest_QNAME, ReadTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "writeTestResponse")
    public JAXBElement<WriteTestResponse> createWriteTestResponse(WriteTestResponse value) {
        return new JAXBElement<WriteTestResponse>(_WriteTestResponse_QNAME, WriteTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.wx.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

}
