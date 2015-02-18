/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.AdminUsr;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ¿.¿.¿
 */
@Local
public interface TestSessionBeanLocal {

    public String test();

    public String writeTest();

    public List<AdminUsr> readTest(String name);
    
}
