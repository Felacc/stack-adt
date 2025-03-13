/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.c0523788.assignment3;

import ics124.c0523788.assignment2.Ics124SinglyLinkedList;


/**
 *
 * @author felix
 */
public class StackUsingList implements Ics124Stack{

    private Ics124SinglyLinkedList<Integer> data;
    private int size;
    private int i; // current position in array
    
    public StackUsingList() {
        this(100);
    }
    
    public StackUsingList(int size) {
        this.size = size;
        this.data = new Ics124SinglyLinkedList<>();
        this.i = 0;
    }
    
    // Getters and Setters
    public int getSize() {
        return this.size;
    }
    
    public Ics124SinglyLinkedList<Integer> getData() {
        return this.data;
    }
            
    @Override
    public boolean isEmpty() {
        return this.data.size() == 0;
    }

    @Override
    public boolean isFull() {
        return this.i == size;
        
    }

    @Override
    public Integer peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to peek at.");
        }
        
        return this.data.get(i-1);
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to pop off.");
        }
        Integer n = this.data.get(i - 1);
        this.data.remove(i - 1);
        this.i--;
        return n;
    }

    @Override
    public void push(Integer a) {
        // check if current position would overflow stack
        if (i >= size) {
            throw new StackOverflowException("The stack is full.");
        }
        
        this.data.add(i, a);
        this.i++;
    }
    
}
