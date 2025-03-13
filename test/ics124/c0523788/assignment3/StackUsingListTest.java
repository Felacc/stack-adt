/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.c0523788.assignment3;

import ics124.c0523788.assignment3.StackUsingList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felix Michel
 */
public class StackUsingListTest {
    
    public StackUsingListTest() {
    }
    
    @Test
    public void testIsEmpty() {
        StackUsingList s = new StackUsingList();
        assertTrue(s.isEmpty());
        s.push(12);
        assertFalse(s.isEmpty());
    }
    
    @Test
    public void testPush() {
        StackUsingList s = new StackUsingList();
        assertTrue(s.isEmpty());
        
        s.push(10);
        assertFalse(s.isEmpty());
        
        int n = s.peek();
        assertEquals(10, n);
    }
    
    @Test
    public void testIsFull() {
        StackUsingList s = new StackUsingList();
        StackUsingList t = new StackUsingList();
        assertFalse(t.isFull());
        
        t.push(1);
        assertFalse(t.isFull());
    }
    
    @Test
    public void testPeekWithOneValue() {
        StackUsingList s = new StackUsingList();
        s.push(11);
        int n = s.peek();
        assertEquals(11, n);
    }
    
    @Test
    public void testPeekWithEmptyStackException() {
        StackUsingList s = new StackUsingList();
        
        try {
            s.peek();
            fail("StackUnderflowException was not thrown");
        } catch (Exception e) {
            System.out.println("From testPeekWithEmptyStackException(): \n" + e);
            assertNotNull(e);
        }
    }
    
    @Test
    public void testPeekWithMultipleValues() {
        StackUsingList s = new StackUsingList();
        s.push(11);
        int n = s.peek();
        assertEquals(11, n);
        s.push(11);
        s.push(32);
        s.push(423);
        s.push(1133);
        s.push(6);
        n = s.peek();
        assertEquals(6, n);
    }
    
    @Test
    public void testPopWithOneValue() {
        StackUsingList s = new StackUsingList();
        s.push(32);
        int n = s.pop();
        assertEquals(32, n);
    }
    
    @Test
    public void testPopWithEmptyStack() {
        StackUsingList s = new StackUsingList();
        
        try {
            int n = s.pop();
            fail("StackUnderflowException was not thrown");
        } catch (Exception e) {
            System.out.println("From testPopWithEmptyStack(): \n" + e);
            assertNotNull(e);
        }
    }
    
    @Test
    public void testPopWithMultipleValues() {
        StackUsingList s = new StackUsingList();
        s.push(32);
        int n = s.pop();
        assertEquals(32, n);
        s.push(3);
        s.push(12);
        s.push(34443);
        s.push(4);
        s.push(345);
        s.push(234);
        s.push(543);
        n = s.pop();
        assertEquals(543, n);
        
    }
    
}
