/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dxmlparser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derwin
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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

    @Test
    public void testNewEmployee() {
        Employee stan = new Employee();
    }
    
    @Test
    public void testNewWithDetails() {
        Employee duhit = new Employee("Duhit", "Choudhary", 27, 100000);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee("Duhit", "Choudhary", 27, 100000);
        String expResult = "Duhit Choudhary";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}
