/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamalahmed
 */
public class CalculatorTest {
    
   

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {  
        int n1 = 3;
        int n2 = 2;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(n1, n2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testSub() {  
        int n1 = 5;
        int n2 = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.sub(n1, n2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMul() {  
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mul(n1, n2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testDiv() {  
        int n1 = 12;
        int n2 = 6;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.div(n1, n2);
        assertEquals(expResult, result);
        
    }
   
    
}
