package in.aj7parihar.lldoops2200624.lld1class9.producerconsumersmutexynchronizedblock;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    private int maxSize;

    public Producer(Queue<Object> queue, String threadName, int maxSize) {
        this.queue = queue;
        this.threadName = threadName;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            synchronized(queue) {
                if(this.queue.size() < maxSize){
                    System.out.println(this.threadName + ": Adding an element to the queue, size: " + this.queue.size());
                    queue.add(new Object());
                    System.out.println(this.threadName + ": After Adding an element to the queue, size: " + this.queue.size());
                }
            }
        }
    }
}
