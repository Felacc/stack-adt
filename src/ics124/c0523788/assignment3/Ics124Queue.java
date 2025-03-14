package ics124.c0523788.assignment3;

import ics124.c0523788.assignment2.Ics124SinglyLinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 *
 * @author Felix Michel
 */
public class Ics124Queue<E> {
    private Ics124SinglyLinkedList<E> queue;
    
    // Default Constructor
    public Ics124Queue() {
        queue = new Ics124SinglyLinkedList<>();
    }
    
    // Methods
    public boolean add(E e)  {
        if (e == null) {
            throw new NullPointerException(e + " is null. Null elements not permitted.");
        }
        
        queue.add(queue.size(), e);
        return true; // will never be false since the SLL is unbounded
    }
    
    public E element() {
        if (queue.size() == 0) {
            throw new NoSuchElementException("Cannot view element, the queue is empty.");
        }
        
        return queue.get(0);
    }
    
    public boolean offer(E e){
        // Not sure how this is supposed to be any different than add rn?
        if (e == null) {
            throw new NullPointerException(e + " is null. Null elements not permitted.");
        }
        
        queue.add(queue.size(), e);
        return true; // will never false since the SLL is unboundeds
    }
    
    public E peek() {
        if (queue.size() == 0) {
            return null;
        }
        
        return queue.get(0);
    }
    
    public E poll() {
        if (queue.size() == 0) {
            return null;
        }
        
        return queue.remove(0);
    }
    
    public E remove() {
        if (queue.size() == 0) {
            throw new NoSuchElementException("Cannot remove element, the queue is empty.");
        }
        return queue.remove(0);
    }
    
    
        
}
