package in.aj7parihar.lldoops2200624.lld1class9.producerconsumerproblem;

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
            // Without locking mechanism the size of the queue was increasing beyond maxsize, since multiple
            // threads were checking the size at the same time and if size was < maxSize then adding
            // the object to queue simultaneously.
            if(this.queue.size() > 0){
                System.out.println(this.threadName + ": Removing an element from the queue, size: " + this.queue.size());
                // As per the output we can figure out that, thread must have been preempted here
                // and context switch must have happened here so that other switch came in.
                queue.remove();
                System.out.println(this.threadName + ": After Removing an element from the queue, size: " + this.queue.size());
            }
        }
    }
}
