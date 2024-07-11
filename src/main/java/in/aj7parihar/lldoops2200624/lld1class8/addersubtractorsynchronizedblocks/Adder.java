package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedblocks;

public class Adder implements Runnable {
    private Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // Critical Section of the Code hence applying synchronized block here
            // Synchronized block is always applied on object, here it is count
            synchronized (count) {
                // Implicitly the synchronized will take a lock on the count object
                // and will unlock once the block operation is finished.
                System.out.println("Adding: " + i + " " + Thread.currentThread().getName());
                count.value = count.value + i;
            }
        }
    }
}
