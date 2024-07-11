package in.aj7parihar.lldoops2200624.lld1class8.addersubtractorsynchronizedblocks;

public class Count extends Object {
    // Class Object is the root of the class hierarchy.
    // Every class has Object as a superclass.
    // All objects, including arrays, implement the methods of this class.

    // Synchornized -
    // In java the Object (parent of all class) internally has locking mechanism
    // and Java takes advantage of that, and it creates something called Synchornized (is a keyword).

    // And the critical section that needs to be synchronized or locks to be implemented can be done on
    // any shared data/value/variable. So shared data will have by default locking mechanism (that we
    // implemented explicitly in Adder and Subtractor class where our critical section was) if you use
    // SYNCHRONIZED BLOCKS.
    int value = 0; // it is a counter
}
