package ui;

import model.JuandiQueue;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void main(String[] args) {
        //Case 1
        ArrayList<Integer> objectsInt = new ArrayList<>();
        objectsInt.addAll(List.of(1,2,3,8));

        JuandiQueue<T> jdQueue = new JuandiQueue<>();
        for (Integer obj : objectsInt){
            jdQueue.enqueue((T) obj);
        }

        System.out.println(jdQueue.front());
        System.out.println(jdQueue.isEmpty());
        System.out.println(jdQueue.dequeue());

        System.out.println("--");
        System.out.println(jdQueue.front());
        System.out.println(jdQueue.isEmpty());
    }



}
