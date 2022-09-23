package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuandiQueueTest <T>{
    private JuandiQueue<T> jdQueue;
    public void setup1(){
        jdQueue = new JuandiQueue<>();
    }

    @Test
    public void correcEncolar(){
        //Case 1
        setup1();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        jdQueue.enqueue((T)a);
        jdQueue.enqueue((T)b);
        jdQueue.enqueue((T)c);
        jdQueue.enqueue((T)d);

        assert(1, jdQueue.front());
    }
}