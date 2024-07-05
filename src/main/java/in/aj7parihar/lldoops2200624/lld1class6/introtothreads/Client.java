package in.aj7parihar.lldoops2200624.lld1class6.introtothreads;

public class Client {
    public static void main(String[] args) {
        demoThreads();
    }
    public static void demoThreads() {
        System.out.println("Thread Started and name is - " + Thread.currentThread().getName());
        // main thread is always there without us creating any

        // Object of HelloWorldPrinter is created
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        // HelloWorldPrinter object ref. is passed to Thread so that it can implement run()
        Thread thread = new Thread(helloWorldPrinter);
        // public class Thread implements Runnable
        thread.start();

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start();
            // The order of printing or execution of thread is scheduled by scheduler hence
            // the order is not fixed, and this scheduling is done by OS.
        }
    }
}
