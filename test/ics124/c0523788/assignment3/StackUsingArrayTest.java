package ics124.c0523788.assignment3;

import ics124.c0523788.assignment3.StackUsingArray;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felix Michel
 */
public class StackUsingArrayTest {
    
    public StackUsingArrayTest() {
    }
    
    @Test
    public void testIsEmpty() {
        StackUsingArray s = new StackUsingArray();
        assertTrue(s.isEmpty());
        s.push(12);
        assertFalse(s.isEmpty());
    }
    
    @Test
    public void testPush() {
        StackUsingArray s = new StackUsingArray();
        assertTrue(s.isEmpty());
        
        s.push(10);
        assertFalse(s.isEmpty());
        
        int n = s.peek();
        assertEquals(10, n);
    }
    
    @Test
    public void testPushOverflowException() {
        StackUsingArray s = new StackUsingArray(4);
        s.push(1); // top index is 0
        s.push(2); // top index is 1
        s.push(3); // top index is 2
        s.push(4); // top index is 3 -- this should pass
        try {
            s.push(5); // top index is 4 -- this should fail
            fail("Does not StackOverflowException");
        } catch (Exception e) {
            System.out.println("From testPushOverflowException(): \n" + e);
            assertNotNull(e);
        }
    }
    
    @Test
    public void testIsFull() {
        StackUsingArray s = new StackUsingArray(0);
        assertTrue(s.isFull());
        
        StackUsingArray t = new StackUsingArray(1);
        assertFalse(t.isFull());
        
        t.push(1);
        assertTrue(t.isFull());
    }
    
    @Test
    public void testPeekWithOneValue() {
        StackUsingArray s = new StackUsingArray();
        s.push(11);
        int n = s.peek();
        assertEquals(11, n);
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
    public void testPopWithOneValue() {
        StackUsingArray s = new StackUsingArray();
        s.push(32);
        int n = s.pop();
        assertEquals(32, n);
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
    
    
    
    
}
