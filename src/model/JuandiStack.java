package model;

import Exceptions.EmptyJuandiStackException;

public class JuandiStack <T> implements IStack<T> {
    private Nodo<T> head;

    public JuandiStack(){
    }

    @Override
    public void push(T element) {
        Nodo<T> current = new Nodo<>();
        if (head==null){
            head = new Nodo<>(element);
        }else {
            current.setNext(head);
            head = current;
            current.setValue(element);
        }
    }

    @Override
    public T pop() {
        if (head==null) {
            throw new EmptyJuandiStackException();
        }else {
            T tReturn = head.getValue();
            if(head.getNext()==null){
                head=null;
            }else {
                head = head.getNext();
            }
            return tReturn;
        }
    }

    @Override
    public T peek() {
        if (head==null) {
            throw new EmptyJuandiStackException();
        }else {
            return head.getValue();
        }
    }

    @Override
    public boolean isEmpty() {
        if (head==null) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void clear(){
        head = null;
    }
}
