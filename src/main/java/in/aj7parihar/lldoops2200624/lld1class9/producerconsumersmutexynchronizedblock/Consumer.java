package in.aj7parihar.lldoops2200624.lld1class9.producerconsumersmutexynchronizedblock;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    private int maxSize;

    public Consumer(Queue<Object> queue, String threadName, int maxSize) {
        this.queue = queue;
        this.threadName = threadName;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            synchronized(queue){
                if(this.queue.size() > 0){
                    System.out.println(this.threadName + ": Removing an element from the queue, size: " + this.queue.size());
                    queue.remove();
                    System.out.println(this.threadName + ": After Removing an element from the queue, size: " + this.queue.size());
                }
            }
        }
    }
}
