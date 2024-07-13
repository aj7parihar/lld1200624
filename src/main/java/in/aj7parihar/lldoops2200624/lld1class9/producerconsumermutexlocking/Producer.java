package in.aj7parihar.lldoops2200624.lld1class9.producerconsumermutexlocking;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    private int maxSize;
    private Lock lock;

    public Producer(Queue<Object> queue, String threadName, int maxSize, Lock lock) {
        this.queue = queue;
        this.threadName = threadName;
        this.maxSize = maxSize;
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true){
            lock.lock();
            if(this.queue.size() < maxSize){
                System.out.println(this.threadName + ": Adding an element to the queue, size: " + this.queue.size());
                queue.add(new Object());
                System.out.println(this.threadName + ": After Adding an element to the queue, size: " + this.queue.size());
            }
            lock.unlock();
        }
    }
}
