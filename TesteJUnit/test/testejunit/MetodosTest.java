/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 771000343
 */
public class MetodosTest {
    
    public MetodosTest() {
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
     * Test of getIniciais method, of class Metodos.
     */
    @Test
    public void testGetIniciais() {
        System.out.println("getIniciais");
        String nome = "Felipe Costa Fernandes";
        Metodos instance = new Metodos();
        String expResult = "FCF";
        String result = instance.getIniciais(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of progressaoAritmetica method, of class Metodos.
     */
    @Test
    public void testProgressaoAritmetica() {
        System.out.println("progressaoAritmetica");
        int a = 2;
        int b = 3;
        int c = 5;
        Metodos instance = new Metodos();
        int[] expResult = {2,5,8,11,14};
        int[] result = instance.progressaoAritmetica(a, b, c);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of progressaoGeometrica method, of class Metodos.
     */
    @Test
    public void testProgressaoGeometrica() {
        System.out.println("progressaoGeometrica");
        int a = 2;
        int b = 3;
        int c = 5;
        Metodos instance = new Metodos();
        int[] expResult = {2,6,18,54,162};
        int[] result = instance.progressaoGeometrica(a, b, c);
        assertArrayEquals(expResult, result);
    }
    
}
