package in.aj7parihar.lldoops2200624.lld1class9.printinorder;

import java.util.concurrent.Semaphore;

public class Third implements Runnable {
    private Semaphore thirdSemaphore;

    public Third(Semaphore thirdSemaphore) {
        this.thirdSemaphore = thirdSemaphore;
    }

    @Override
    public void run() {
        try {
            thirdSemaphore.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
