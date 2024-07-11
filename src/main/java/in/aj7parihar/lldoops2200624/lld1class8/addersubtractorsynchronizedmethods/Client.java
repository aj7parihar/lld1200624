package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedmethods;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        demoAdderSubtractorProblem();
    }
    public static void demoAdderSubtractorProblem() throws InterruptedException {
        Count count1 = new Count();
        Count count2 = new Count();

        Adder adder = new Adder(count1);
        Subtractor subtractor = new Subtractor(count2);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);

        thread1.start();
        // thread1.join(); - If we join here then thread2 will not start until thread1 is completed
        // and this case will be sequential.
        thread2.start();

        // thread1.start() & thread2.start() will take some time to complete,
        // but within that time period main() thread may exit
        // hence we need to join thread1 & thread2 to wait for them to end

        thread1.join(); // using join here will start thread1 & thread2 in parallel
        // and in real case we join all the threads only when all of them have already started.
        thread2.join();

        Count count = new Count();
        System.out.println(count.getValue());
        // Below problem (was in lld1class7) is resolved using Synchronized methods
        // the output above is unpredictable i.e. everytime a new value is displayed hence this is
        // a problem and solutions to this we will discuss in Synchronization class.

        // LESS CLEAR... I HAVE TO UNDERSTAND IT WITH CLARITY
    }
}
