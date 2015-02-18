/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ejb.Stateless;
import entity.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ¿.¿.¿
 */
@Stateless
public class TestSessionBean implements TestSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    private EntityManager em;
    
    //Constructor
    public TestSessionBean() {
    }
    
    /**
     *
     * @return
     */
    @Override
    public String test () {
        return "Hello World";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String writeTest (){
        AdminUsr adminTest = new AdminUsr();
        adminTest.setFirstName("firstNameTest");
        adminTest.setLastName("lastNameTest");
        em.persist(adminTest);
        return "Write Complete";
    }
    
    /**
     *
     * @param name
     * @return
     */
    @Override
    public List<AdminUsr> readTest (String name){
        List<AdminUsr> adminList = new ArrayList<AdminUsr>();
        Query query = em.createNamedQuery("AdminUsr.findByFirstName").setParameter("firstName", name);

        for (Object o : query.getResultList()) {
            AdminUsr admin = (AdminUsr) o;
            adminList.add(admin);
        }
        
        return adminList;

    }
    
    
}
