package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedmethods;

public class Adder implements Runnable {
    private Count count1;
    public Adder(Count count) {
        this.count1 = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Adding: " + i + " " + Thread.currentThread().getName());
            count1.incrementValue(i);
        }
    }
}
