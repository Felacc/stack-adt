/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.assignment3;

/**
 *
 * @author felix
 */
public class StackUsingArray implements Ics124Stack {
    private Integer[] array;
    private int size;
    private int i; // current position in array
    
    public StackUsingArray() {
        this(100);
    }
    
    public StackUsingArray(int size) {
        this.size = size;
        this.array = new Integer[size];
    }
    
    // Getters and Setters
    public int getSize() {
        return this.size;
    }
    
    public Integer[] getArray() {
        return this.array;
    }
            
    @Override
    public boolean isEmpty() {
        return this.array[0] == null;
    }

    @Override
    public boolean isFull() {
        return this.i == size;
        
    }

    @Override
    public Integer peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void push(Integer a) {
        // check if current position would overflow stack
        if (i >= size) {
            throw new StackOverflowException("The stack is full.");
        }
        
        this.array[i] = a;
        this.i++;
    }
    
}
