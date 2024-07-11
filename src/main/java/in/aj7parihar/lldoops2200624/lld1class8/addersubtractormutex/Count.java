package in.aj7parihar.lldoops2200624.lld1class8.addersubtractormutex;

public class Count {
    // Synchornized -
    // In java all the objects internally have locking mechanism
    // and Java takes advantage of that, and it creates something called Synchornized (is a keyword).

    // And the critical section that needs to be synchronized or locks to be implemented can be done on
    // any shared data/value/variable. So shared data will by default have locking mechanism (that we
    // implemented explicitly in Adder and Subtractor class where our critical section was) if you use
    // SYNCHRONIZED BLOCKS or simply declare them as Synchornized.

    int value = 0; // it is a counter
}
