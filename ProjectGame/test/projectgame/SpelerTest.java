/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgame;

import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bekem
 */
public class SpelerTest {
    
    
    public SpelerTest() {
        
       
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
     * Test of barricadeLopen method, of class Speler.
     */
    @Test
    public void testBarricadeLopen() {
        System.out.println("barricadeLopen");
        KeyEvent e = null;
        int[][] veld = null;
        int waarde = 0;
        Speler instance = null;
        instance.barricadeLopen(e, veld, waarde);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lopen method, of class Speler.
     */
    @Test
    public void testLopen() {
        System.out.println("lopen");
        KeyEvent e = null;
        int[][] veld = null;
        Speler instance = null;
        instance.lopen(e, veld);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nieuwVeld method, of class Speler.
     */
    @Test
    public void testNieuwVeld() {
        System.out.println("nieuwVeld");
        int[][] veld = null;
        Speler instance = null;
        int[][] expResult = null;
        int[][] result = instance.nieuwVeld(veld);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSleutelWaarde method, of class Speler.
     */
    @Test
    public void testGetSleutelWaarde() {
        System.out.println("getSleutelWaarde");
        Speler instance = new Speler(0,0,100);
        int expResult = 100;
        int result = instance.getSleutelWaarde();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getX method, of class Speler.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Speler instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getY method, of class Speler.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Speler instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSleutelWaarde method, of class Speler.
     */
    @Test
    public void testSetSleutelWaarde() {
        System.out.println("setSleutelWaarde");
        int sleutelWaarde = 100;
        Speler instance = new Speler(0,0,100);
        instance.setSleutelWaarde(100);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setX method, of class Speler.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Speler instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Speler.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Speler instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
