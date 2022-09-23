package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuandiQueueTest <T>{
    private JuandiQueue<T> jdQueue;
    public void setup1(){
        jdQueue = new JuandiQueue<>();
    }
    public void setup2(){
        setup1();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        jdQueue.enqueue((T)a);
        jdQueue.enqueue((T)b);
        jdQueue.enqueue((T)c);
        jdQueue.enqueue((T)d);
    }

    @Test
    public void correctEnqueue(){
        setup1();
        Integer a = 1;
        jdQueue.enqueue((T)a);
        assertEquals(1, jdQueue.front());
    }

    @Test
    public void correctDequeue(){
        setup2();
        T t1 = jdQueue.front();
        T t2 = jdQueue.dequeue();

        assertEquals(t1, t2);
        assertTrue(!t1.equals(jdQueue.front()));
    }

    @Test
    public void correctFront(){
        setup2();
        assertEquals(1, jdQueue.front());
    }
}