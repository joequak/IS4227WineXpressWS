/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.test;

import entity.AdminUsr;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import test.TestSessionBeanLocal;

/**
 *
 * @author ¿.¿.¿
 */
@WebService(serviceName = "TestWS")
public class TestWS {
    @EJB
    private TestSessionBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "test")
    public String test() {
        return ejbRef.test();
    }

    @WebMethod(operationName = "writeTest")
    public String writeTest() {
        return ejbRef.writeTest();
    }

    @WebMethod(operationName = "readTest")
    public List<AdminUsr> readTest(@WebParam(name = "name") String name) {
        return ejbRef.readTest(name);
    }
    
}
