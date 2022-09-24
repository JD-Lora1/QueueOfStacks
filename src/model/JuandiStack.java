package model;

import Exceptions.EmptyJuandiStackException;

public class JuandiStack <T> implements IStack<T> {
    private Nodo<T> head;

    public JuandiStack(){
    }

    @Override
    public void push(T element) {
        Nodo<T> current = head;
        if (head==null){
            head= new Nodo<>(element);
        }else {
            push(element,head);
        }
    }

    private void push(T element, Nodo<T> current){
        if (current.getNext()==null){
            current.setNext(new Nodo<>(element));
        }else {
            push(element,current.getNext());
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
}
