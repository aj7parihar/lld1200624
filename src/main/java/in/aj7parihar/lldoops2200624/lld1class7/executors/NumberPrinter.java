package in.aj7parihar.lldoops2200624.lld1class7.executors;

public class NumberPrinter implements Runnable{
    private int number;

    public NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing number " + this.number + " and thread is "
                + Thread.currentThread().getName());
    }
}
