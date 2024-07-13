package in.aj7parihar.lldoops2200624.lld1class9.printinorder;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Semaphore firstSemaphore = new Semaphore(1);
        Semaphore secondSemaphore = new Semaphore(0);
        Semaphore thirdSemaphore = new Semaphore(0);

        First first = new First(firstSemaphore, secondSemaphore);
        Second second = new Second(secondSemaphore, thirdSemaphore);
        Third third = new Third(thirdSemaphore);

        Thread A = new Thread(first);
        Thread B = new Thread(second);
        Thread C = new Thread(third);

        A.start();
        B.start();
        C.start();
    }
}
