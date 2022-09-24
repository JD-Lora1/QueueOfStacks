package model;

import Exceptions.EmptyJuandiStackException;

public class JuandiQueue <T> implements IQueue<T>{
    private JuandiStack<T> stack ;
    private JuandiStack<T> stackTemp;

    public JuandiQueue(){
        stack = new JuandiStack<>();
        stackTemp = new JuandiStack<>();
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
        }catch (EmptyJuandiStackException e){
            System.out.println("Empty Queue. Cannot Invoke front()");
            return null;
        }
    }

    @Override
    public T front(){
        try {
            return stack.peek();
        }catch (EmptyJuandiStackException e){
            System.out.println("Empty Queue. Cannot Invoke Front()");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
