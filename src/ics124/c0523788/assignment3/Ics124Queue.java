package ics124.c0523788.assignment3;

import ics124.c0523788.assignment2.Ics124SinglyLinkedList;
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
        return true; // will never throw IllegalStateException since the SLL is unbounded
    }
    
    public E element() {
      
    }
    
    public boolean offer(E e){
        throw new UnsupportedOperationException();
    }
    
    public E peek() {
        if (queue.size() == 0) {
            return null;
        }
        
        return queue.get(0);
    }
    
    public E poll() {
        throw new UnsupportedOperationException();
    }
    
    public E remove() {
        throw new UnsupportedOperationException();
    }
    
    
        
}
