/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felix
 */
public class StackUsingArrayTest {
    
    public StackUsingArrayTest() {
    }
    
    @Test
    public void testDefaultStackSize() {
        StackUsingArray s = new StackUsingArray();
        assertEquals(100, s.getSize());
    }
    
    @Test
    public void testStackOfAssignedSize() {
        StackUsingArray s = new StackUsingArray(123);
        assertEquals(123, s.getSize());
    }
    
    @Test
    public void testIsEmpty() {
        StackUsingArray s = new StackUsingArray();
        assertEquals(true, s.isEmpty());
        s.getArray()[0] = 12;
        assertEquals(false, s.isEmpty());
    }
    
    @Test
    public void testPush() {
        StackUsingArray s = new StackUsingArray();
        assertEquals(true, s.isEmpty());
        
        s.push(10);
        assertEquals(false, s.isEmpty());
        
        int n = s.getArray()[0];
        assertEquals(10, n);
    }
    
    @Test
    public void testIsFull() {
        StackUsingArray s = new StackUsingArray(0);
        assertEquals(true, s.isFull());
        
        StackUsingArray t = new StackUsingArray(1);
        assertEquals(false, t.isFull());
        
        t.push(1);
        assertEquals(true, t.isFull());
    }
    
    @Test
    public void testPeekWithOneValue() {
        StackUsingArray s = new StackUsingArray();
        s.push(11);
        int n = s.peek();
        assertEquals(11, n);
    }
    
    @Test
    public void testPeekWithEmptyStackException() {
        StackUsingArray s = new StackUsingArray();
        
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
        StackUsingArray s = new StackUsingArray();
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
        StackUsingArray s = new StackUsingArray();
        s.push(32);
        int n = s.pop();
        assertEquals(32, n);
    }
    
    @Test
    public void testPopWithEmptyStack() {
        StackUsingArray s = new StackUsingArray();
        
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
        StackUsingArray s = new StackUsingArray();
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
