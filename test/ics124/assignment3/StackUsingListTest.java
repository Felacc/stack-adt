/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.assignment3;

import ics124.c0523788.assignment3.StackUsingList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felix
 */
public class StackUsingListTest {
    
    public StackUsingListTest() {
    }

    @Test
    public void testDefaultStackSize() {
        StackUsingList s = new StackUsingList();
        assertEquals(100, s.getSize());
    }
    
    @Test
    public void testStackOfAssignedSize() {
        StackUsingList s = new StackUsingList(123);
        assertEquals(123, s.getSize());
    }
    
    @Test
    public void testIsEmpty() {
        StackUsingList s = new StackUsingList();
        assertEquals(true, s.isEmpty());
        s.getData().add(0, 12);
        assertEquals(false, s.isEmpty());
    }
    
    @Test
    public void testPush() {
        StackUsingList s = new StackUsingList();
        assertEquals(true, s.isEmpty());
        
        s.push(10);
        assertEquals(false, s.isEmpty());
        
        int n = s.getData().get(0);
        assertEquals(10, n);
    }
    
    @Test
    public void testIsFull() {
        StackUsingList s = new StackUsingList(0);
        assertEquals(true, s.isFull());
        
        StackUsingList t = new StackUsingList(1);
        assertEquals(false, t.isFull());
        
        t.push(1);
        assertEquals(true, t.isFull());
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
