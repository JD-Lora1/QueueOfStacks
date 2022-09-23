package ui;

import model.JuandiQueue;

public class Main {

    public static <T> void main(String[] args) {
        //Case 1
        JuandiQueue<Integer> jdQueue = new JuandiQueue<>();
        jdQueue.enqueue(1);
        jdQueue.enqueue(2);
        jdQueue.enqueue(3);
        System.out.println(jdQueue.front());
        System.out.println(jdQueue.isEmpty());
        jdQueue.dequeue();
        System.out.println(jdQueue.front());
        System.out.println(jdQueue.isEmpty());
    }



}
