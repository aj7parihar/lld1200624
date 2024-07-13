package in.aj7parihar.lldoops2200624.lld1class9.producerconsumermutexlocking;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        demoProducerConsumerMutex();
    }
    public static void demoProducerConsumerMutex() {
        Lock lock = new ReentrantLock(); // Creating a lock and passing it to Producer and Consumer
        // so that they have shared locks rather than separate locks

        // Queue of simple objects of type concurrent LinkedQueue
        Queue<Object> queue = new ConcurrentLinkedQueue<>();

        Producer p1 = new Producer(queue, "p1", 5, lock);
        Producer p2 = new Producer(queue, "p2", 5, lock);
        Producer p3 = new Producer(queue, "p3", 5, lock);
        Producer p4 = new Producer(queue, "p4", 5, lock);
        Producer p5 = new Producer(queue, "p5", 5, lock);

        Consumer c1 = new Consumer(queue, "c1", 5, lock);
        Consumer c2 = new Consumer(queue, "c2", 5, lock);
        Consumer c3 = new Consumer(queue, "c3", 5, lock);
        Consumer c4 = new Consumer(queue, "c4", 5, lock);
        Consumer c5 = new Consumer(queue, "c5", 5, lock);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        Thread t6 = new Thread(c1);
        Thread t7 = new Thread(c2);
        Thread t8 = new Thread(c3);
        Thread t9 = new Thread(c4);
        Thread t10 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
