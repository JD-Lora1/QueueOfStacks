package model;

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
        while (!stack.isEmpty()){
            stackTemp.push(stack.pop());
        }
        stack.push(element);
        for (T s : stackTemp){
            stack.push(s);
        }
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
