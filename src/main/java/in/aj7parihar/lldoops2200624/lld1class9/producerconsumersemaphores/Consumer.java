package in.aj7parihar.lldoops2200624.lld1class9.producerconsumersemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String threadName;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Consumer(Queue<Object> queue, String threadName, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.threadName = threadName;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                consumerSemaphore.acquire(); // consumer thread will acquire a lock to consume/remove element from queue
                System.out.println(this.threadName + ": Removing an element from the queue, size: " + this.queue.size());
                // In this also the preemption occurs causing context switch to happen but
                // the queue size does not increase and multiple threads can enter critical section at the same time (together)
                queue.remove();
                System.out.println(this.threadName + ": After Removing an element from the queue, size: " + this.queue.size());
                producerSemaphore.release(); // once a thread has consumed an element, producer will be signalled
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
