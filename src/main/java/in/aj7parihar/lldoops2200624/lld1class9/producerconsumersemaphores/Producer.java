package in.aj7parihar.lldoops2200624.lld1class9.producerconsumersemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(Queue<Object> queue, String threadName, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.threadName = threadName;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire(); // producer thread will acquire a lock to produce/add element to queue
                System.out.println(this.threadName + ": Adding an element to the queue, size: " + this.queue.size());
                // In this also the preemption occurs causing context switch to happen but
                // the queue size does not increase and multiple threads can enter critical section at the same time (together)
                queue.add(new Object());
                System.out.println(this.threadName + ": After Adding an element to the queue, size: " + this.queue.size());
                consumerSemaphore.release(); // once producer thread has added to the queue, consumer will be notified
                // to consume from the queue
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
