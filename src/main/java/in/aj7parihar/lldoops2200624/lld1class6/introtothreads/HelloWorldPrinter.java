package in.aj7parihar.lldoops2200624.lld1class6.introtothreads;

public class HelloWorldPrinter implements Runnable{

    // Runnable is a functional interface whose functional method is run().
    // Represents an operation that does not return a result.

    // In Java whenever we have to create a thread or multi-threads then we will have to
    // implement an interface called "Runnable", and Runnable interface has a method called
    // "run()", so whatever tasks we want to do within the thread we override "run()" and
    // put in it.

    @Override
    public void run(){
        System.out.println("Hello World and name is - " + Thread.currentThread().getName());
    }
}
