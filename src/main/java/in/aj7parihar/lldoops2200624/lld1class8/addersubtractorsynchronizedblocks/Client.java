package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedblocks;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        demoAdderSubtractorProblem();
    }
    public static void demoAdderSubtractorProblem() throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

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

        System.out.println(count.value);
        // Below problem (was in lld1class7) is resolved using Synchronized blocks
        // the output above is unpredictable i.e. everytime a new value is displayed hence this is
        // a problem and solutions to this we will discuss in Synchronization class.
    }
}
