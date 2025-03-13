/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.c0523788.assignment3;

/**
 *
 * @author felix
 */
public class StackUsingArray implements Ics124Stack {
    private Integer[] data;
    private int size;
    private int i; // current position in array
    
    public StackUsingArray() {
        this(100);
    }
    
    public StackUsingArray(int size) {
        this.size = size;
        this.data = new Integer[size];
        this.i = 0;
    }
    
    // Getters and Setters
    public int getSize() {
        return this.size;
    }
    
    public Integer[] getData() {
        return this.data;
    }
            
    @Override
    public boolean isEmpty() {
        return this.data[0] == null;
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
        
        return this.data[i - 1];
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to pop off.");
        }
        Integer n = this.data[i - 1];
        this.data[i - 1] = null;
        this.i--;
        return n;
    }

    @Override
    public void push(Integer a) {
        // check if current position would overflow stack
        if (i >= size) {
            throw new StackOverflowException("The stack is full.");
        }
        
        this.data[i] = a;
        this.i++;
    }
    
}
