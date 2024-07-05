package in.aj7parihar.lldoops2200624.lld1class5.interfaces;

public interface Animal {
    // Interfaces methods are by implicitly public
    // Object of the class won't be created.
    
    void eat();
    void move();

    // In the future, if we want to implement our own method that is not there inside interface,
    // then Java 8 and further versions provide a "default" method which we can override.
    // if we notice, this method id not there in Lion class.
    default void fly() {
        System.out.println("Oops can't fly");
    }
}
