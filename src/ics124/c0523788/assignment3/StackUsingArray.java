package ics124.c0523788.assignment3;

/**
 *
 * @author Felix Michel
 */
public class StackUsingArray implements Ics124Stack {
    private Integer[] data;
    private int size;
    private int top; // represents the index of the item on top of the stack; max index is size - 1
    
    // default stack array size: 8
    public StackUsingArray() {
        this(8);
    }
    
    public StackUsingArray(int size) {
        this.size = size;
        this.data = new Integer[size];
        this.top = -1; // negative one to represent that this stack does not yet have a top
    }
    
    // Implementation of interface methods
    
    // if the top of the stack is set at 0
    @Override
    public boolean isEmpty() {
        return this.top == - 1;
    }

    @Override
    public boolean isFull() {
        return this.top == size - 1;
        
    }

    @Override
    public Integer peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to peek at.");
        }
        
        return this.data[top];
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("The stack is empty. Nothing to pop off.");
        }
        Integer n = this.data[top];
        this.data[top] = null;
        this.top--;
        return n;
    }

    @Override
    public void push(Integer a) {
        // check if current position would overflow stack
        if (this.isFull()) {
            throw new StackOverflowException("The stack is full.");
        }
        
        this.data[top + 1] = a;
        this.top++;
    }
    
}
