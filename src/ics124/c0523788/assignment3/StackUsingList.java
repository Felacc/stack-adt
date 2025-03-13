package ics124.c0523788.assignment3;

import ics124.c0523788.assignment2.Ics124SinglyLinkedList;


/**
 *
 * @author Felix Michel
 */
public class StackUsingList implements Ics124Stack{

    private Ics124SinglyLinkedList<Integer> data;    
    
    public StackUsingList() {
        data = new Ics124SinglyLinkedList<>();
    }
    
    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public boolean isFull() {
        return false; // an SLL can never be full
        
    }

    @Override
    public Integer peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to peek at.");
        }
        
        return data.get(data.size() - 1);
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to pop off.");
        }
        Integer n = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return n;
    }

    @Override
    public void push(Integer a) {
        // The stack can't overflow because it uses an SLL, hence not having the list throw an error
        // The size of the stack is only limited by memory
        this.data.add(data.size(), a);
    }
    
}
