package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedmethods;

public class Count{

    int value = 0; // it is a counter

    // synchronized methods to achieve synchronization
    public synchronized void incrementValue(int offset) {
        // Now this has become the critical section or where the data is shared b/w threads
        // Hence locking will happen here
        this.value += offset;
    }
    // Instead of decrementValue() we can just use incrementValue() and wherever subtraction is needed
    // we can pass negative value to it.
    // In this way we will achieve concurrency b/w threads but not parallelism.

//    public synchronized void decrementValue(int offset) {
//        this.value -= offset;
//    }

    // Two achieve parallelism use two separate count objects.
    // Without two count different count objects it will still be concurrent not parallelism.

    public synchronized int getValue() {
        return this.value;
    }
}
