/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMB;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;
import test.TestWS_Service;

/**
 *
 * @author ¿.¿.¿
 */
@ManagedBean (name = "testMB")
@ViewScoped
public class TestManagedBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/IS4227WineXpressWS-war/TestWS.wsdl")
    private TestWS_Service service;
    
    //InputVariables
    private String inputName;
    
    //Output variables
    private String testString;
    private List<test.AdminUsr> adminList;
    private String writeTestTxt;
    

    /**
     * Creates a new instance of TestManagedBean
     */
    public TestManagedBean() {
        testString = "This is contructed";
        writeTestTxt = "nothing is written";
        adminList = new ArrayList<test.AdminUsr>();
    }

    public void test() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        test.TestWS port = service.getTestWSPort();
        this.setTestString(port.test());
    }

    public void readTest() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        test.TestWS port = service.getTestWSPort();
        this.setAdminList(port.readTest("firstNameTest"));
    }

    public void writeTest() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        test.TestWS port = service.getTestWSPort();
        this.setWriteTestTxt(port.writeTest());
    }

    /**
     * @return the testString
     */
    public String getTestString() {
        return testString;
    }

    /**
     * @param testString the testString to set
     */
    public void setTestString(String testString) {
        this.testString = testString;
    }

    /**
     * @return the adminList
     */
    public List<test.AdminUsr> getAdminList() {
        return adminList;
    }

    /**
     * @param adminList the adminList to set
     */
    public void setAdminList(List<test.AdminUsr> adminList) {
        this.adminList = adminList;
    }

    /**
     * @return the writeTestTxt
     */
    public String getWriteTestTxt() {
        return writeTestTxt;
    }

    /**
     * @param writeTestTxt the writeTestTxt to set
     */
    public void setWriteTestTxt(String writeTestTxt) {
        this.writeTestTxt = writeTestTxt;
    }

    /**
     * @return the inputName
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * @param inputName the inputName to set
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }
    
}
