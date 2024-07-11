package in.aj7parihar.lldoops2200624.lld1class8.addersubtractoratomicdatatypes;

public class Subtractor implements Runnable {
    private Count count;
    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Subtracting: " + i + " " + Thread.currentThread().getName());
            // "value" is of type AtomicInteger and AtomicInteger provides various
            // methods to implement, one such is addAndGet()
            count.value.addAndGet(-i);
        }
    }
}