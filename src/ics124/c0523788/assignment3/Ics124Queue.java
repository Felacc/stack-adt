/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.c0523788.assignment3;

import ics124.c0523788.assignment2.Ics124SinglyLinkedList;

/**
 *
 * @author Felix Michel
 */
public class Ics124Queue<E> {
    private Ics124SinglyLinkedList<E> list;
    
    // Default Constructor
    public Ics124Queue() {
        this.list = new Ics124SinglyLinkedList<>();
    }
    
    // Getters and Setters
    
    
    // Methods
    public boolean add(E e)  {
        this.list.add(0, e);
        return true;
    }
    
    public E element() {
        throw new UnsupportedOperationException();
    }
    
    public boolean offer(E e){
        throw new UnsupportedOperationException();
    }
    
    public E peek() {
        if (list.size() == 0) {
            return null;
        }
        
        return list.get(0);
    }
    
    public E poll() {
        throw new UnsupportedOperationException();
    }
    
    public E remove() {
        throw new UnsupportedOperationException();
    }
    
    
        
}
