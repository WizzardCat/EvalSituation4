/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;

import BDDAIRAFPA.AccessBackOffice;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class AccessBackOfficeDAOTest {
    
    public AccessBackOfficeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     /**
     * Test of create method, of class AccessBackOfficeDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        long keysss = 2;
        AccessBackOffice accesbackoffice = new AccessBackOffice(keysss, "Azuka", "bobo31");
        AccessBackOfficeDAO instance = new AccessBackOfficeDAO();
        String result = instance.create(accesbackoffice).toString();
        String expResult = accesbackoffice.toString();
               
       assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class AccessBackOfficeDAO.
     */
   @Test
    public void testUpdate() {
        System.out.println("update");
        long keysss = 92;
        AccessBackOffice obj = new AccessBackOffice(keysss, "bloody", "marry31");
        AccessBackOfficeDAO instance = new AccessBackOfficeDAO();
        AccessBackOffice unexpResult = instance.find(keysss);
        AccessBackOffice result = instance.update(obj);
        assertNotEquals(unexpResult, result);
    }

    /**
     * Test of find method, of class AccessBackOfficeDAO.
     */
   @Test
    public void testFind() {
        System.out.println("find");
        long id = 92;
        AccessBackOfficeDAO instance = new AccessBackOfficeDAO();
        String expResult = "AccessBackOffice{user_id=92, nickname=bloodyM, password=marry84}";
        String result = instance.find(id).toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class AccessBackOfficeDAO.
     */
 @Test
    public void testDelete() {
        System.out.println("delete");
        AccessBackOffice accesbackoffice = new AccessBackOffice();
        long id = 90;
        AccessBackOfficeDAO instance = new AccessBackOfficeDAO();
        instance.delete(id);
        accesbackoffice = instance.find(id);
        assertFalse(instance.isValid(accesbackoffice));
        
    }
    
    // Creation of my method getAll to find something on my ArrayList
    
 @Test
 public void TestGetAll(){
     System.out.println("get all");
     String result = "";
     String expResult = "";
     AccessBackOfficeDAO instance = new AccessBackOfficeDAO();
     ArrayList<AccessBackOffice> arrayOfResult = instance.getAll();
        for (AccessBackOffice accesbackoffice : arrayOfResult) {
            result += accesbackoffice.toString();
            expResult += instance.find(accesbackoffice.getUser_id()).toString();
        }
     
     assertEquals(expResult, result);
    
 } 
}
