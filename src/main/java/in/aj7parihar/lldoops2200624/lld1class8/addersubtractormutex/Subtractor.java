package in.aj7parihar.lldoops2200624.lld1class8.addersubtractormutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;
    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        // lock at both places (inside or outside the loop) will work same
        // but behaviour will be different, i.e. when lock is inside the loop one operation (read,
        // update & write) on one number will be completed in one go,
        // and context switch can also happen.
        // Whereas when the lock is outside the loop then it will be locked
        // until the operation on entire numbers isn't completed, this will happen sequentially, and
        // context switch will also not happen in this case.

        // lock.lock();
        for (int i = 1; i <= 100; i++) {
            lock.lock();
            // Even though we are putting the lock the context switch will happen, but it will
            // not violate any properties of the good solution and also Pre-Empted problem
            // will not occur
            System.out.println("Subtractor " + i + " " + Thread.currentThread().getName());
            count.value = count.value - i;
            lock.unlock();
        }
        // lock.unlock();

        // Locking mechanism - This is consistent across the languages i.e. same in C++/Java/Python,
        // we do it in same way
    }
}