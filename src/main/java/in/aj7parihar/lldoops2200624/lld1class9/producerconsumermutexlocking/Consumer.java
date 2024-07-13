package in.aj7parihar.lldoops2200624.lld1class9.producerconsumermutexlocking;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    private int maxSize;
    private Lock lock;

    public Consumer(Queue<Object> queue, String threadName, int maxSize, Lock lock) {
        this.queue = queue;
        this.threadName = threadName;
        this.maxSize = maxSize;
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true){
            lock.lock();
            if(this.queue.size() > 0){
                System.out.println(this.threadName + ": Removing an element from the queue, size: " + this.queue.size());
                queue.remove();
                System.out.println(this.threadName + ": After Removing an element from the queue, size: " + this.queue.size());
            }
            lock.unlock();
        }
    }
}
