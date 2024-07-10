package in.aj7parihar.lldoops2200624.lld1class7.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        demoExecutors();
    }
    public static void demoExecutors() {
        // Earlier in Intro to threads class we were creating threads in clients only using
        // Thread class which implements Runnable Interface
        // But here we have dedicated the work of creating threads to Executor Framework.
        // Executor Framework is a part of concurrent package and has ExecutorService which
        // takes care of creation of thread pools as per the no of threads we want.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
    }
}
