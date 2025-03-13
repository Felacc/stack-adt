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
    
    
    
}
