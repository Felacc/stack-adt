/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.c0523788.assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felix Michel
 */
public class Ics124QueueTest {
    
    public Ics124QueueTest() {
    }

    @Test
    public void testAddOneValue() {
        Ics124Queue<Integer> q = new Ics124Queue();
        q.add(1);
        int n = q.peek();
        assertEquals(1, n);
    }
    
    public void testAddTwoValues() {
        Ics124Queue<Integer> q = new Ics124Queue();
        q.add(1);
        q.add(32);
        int n = q.element();
        assertEquals(1, n);
    }
    
    @Test
    public void testAddThrowsExeceptionForNullValues() {
        Ics124Queue<Integer> q = new Ics124Queue();
        
        try {
            Integer n = null;
            q.add(n);
            fail("Expected null pointer exception not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }

    }

    @Test
    public void testElement() {
        Ics124Queue<Integer> q = new Ics124Queue();
        q.add(3);
        int n = q.element();
        assertEquals(3, n);
        
        q.add(4);
        n = q.element();
        assertEquals(3, n);
    }
    
    @Test
    public void testElementThrowNoSuchElementException() {
        Ics124Queue<Integer> q = new Ics124Queue();
        
        try {
            q.element();
            fail("Expected NoSuchElementException not thrown.");
        } catch (Exception e) {
            System.out.println("testElementThrowNoSuchElementException - passed");
            assertNotNull(e);
        }
    }

    @Test
    public void testOffer() {
        Ics124Queue<Integer> q = new Ics124Queue();
        
        q.offer(5);
        assertEquals(5, q.element());
        assertEquals()
        

    }

    @Test
    public void testPeek() {
    }

    @Test
    public void testPoll() {
    }

    @Test
    public void testRemove() {
    }
    
}
