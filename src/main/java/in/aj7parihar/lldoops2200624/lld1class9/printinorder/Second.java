package in.aj7parihar.lldoops2200624.lld1class9.printinorder;

import java.util.concurrent.Semaphore;

public class Second implements Runnable {
    private Semaphore secondSemaphore;
    private Semaphore thirdSemaphore;

    public Second(Semaphore secondSemaphore, Semaphore thirdSemaphore) {
        this.secondSemaphore = secondSemaphore;
        this.thirdSemaphore = thirdSemaphore;
    }

    @Override
    public void run() {
        try {
            secondSemaphore.acquire();
            System.out.print("second");
            thirdSemaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
