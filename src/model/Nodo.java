package model;

public class Nodo <T>{
    private Nodo<T> next;
    private T value;

    public Nodo() {
    }
    public Nodo(T value){
        this.value = value;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
