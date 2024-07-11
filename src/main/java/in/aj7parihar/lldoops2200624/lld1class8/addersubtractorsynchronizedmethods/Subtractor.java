package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedmethods;

public class Subtractor implements Runnable {
    private Count count2;
    public Subtractor(Count count) {
        this.count2 = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Subtracting: " + i + " " + Thread.currentThread().getName());
            count2.incrementValue(-i);
        }
    }
}