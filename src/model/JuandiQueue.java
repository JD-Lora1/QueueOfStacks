package model;

import Exceptions.EmptyJuandiQueueException;

import java.util.EmptyStackException;
import java.util.Stack;

public class JuandiQueue <T> implements IQueue<T>{
    private Stack<T> stack ;

    public JuandiQueue(){
        stack = new Stack<T>();
    }

    @Override
    public void enqueue(T element) {
        Stack<T> stackTemp = new Stack<>();
        for (T s : stack){
            stackTemp.push(stack.pop());
        }
        stack.push(element);
        for (T s : stackTemp){
            stack.push(element);
        }
    }

    @Override
    public T dequeue() {
        return stack.pop();
    }

    @Override
    public T front() throws EmptyJuandiQueueException{
        try {
            if(stack==null){
                throw new EmptyJuandiQueueException();
            }else {
                return stack.peek();
            }
        }catch (EmptyStackException e){
            System.out.println("Empty Queue. Cannot Invoke front()");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
