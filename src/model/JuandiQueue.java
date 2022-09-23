package model;

import java.util.EmptyStackException;
import java.util.Stack;

public class JuandiQueue <T> implements IQueue<T>{
    private Stack<T> stack ;
    private Stack<T> stackTemp;

    public JuandiQueue(){
        stack = new Stack<>();
        stackTemp = new Stack<>();
    }

    @Override
    public void enqueue(T element) {
        while (!stack.isEmpty()){
            stackTemp.push(stack.pop());
        }
        stack.push(element);
        while (!stackTemp.isEmpty()){
            stack.push(stackTemp.pop());
        }
        stackTemp.clear();
    }

    @Override
    public T dequeue() {
        try {
            return stack.pop();
        }catch (EmptyStackException e){
            System.out.println("Empty Queue. Cannot Invoke front()");
            return null;
        }
    }

    @Override
    public T front(){
        try {
            return stack.peek();
        }catch (EmptyStackException e){
            System.out.println("Empty Queue. Cannot Invoke Front()");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
