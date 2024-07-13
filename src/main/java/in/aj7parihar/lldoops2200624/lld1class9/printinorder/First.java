package in.aj7parihar.lldoops2200624.lld1class9.printinorder;

import java.util.concurrent.Semaphore;

public class First implements Runnable {
    private Semaphore firstSemaphore;
    private Semaphore secondSemaphore;

    public First(Semaphore firstSemaphore, Semaphore secondSemaphore) {
        this.firstSemaphore = firstSemaphore;
        this.secondSemaphore = secondSemaphore;
    }

    @Override
    public void run() {
        try {
            firstSemaphore.acquire();
            System.out.print("first");
            secondSemaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
