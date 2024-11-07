package in.aj7parihar.lldoops2200624.lld1class8.addersubtractoratomicdatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Count{
    // Java implicitly provides Atomic Data Types (ADT) .
    // If we use Atomic Data Types then locks are not needed to make threads safe or synchronized.
    // ADT internally take locks.

    // In our case we are using AtomicInteger which is one of the ADT
    AtomicInteger value = new AtomicInteger(0); // it is a counter

    // Que - Shall we use the Atomic Data Types all the time?
    // Ans - Whenever there is Synchronization happening it gurantees the Thread safety.
    // So when there are multiple threads then only use ADT but when threads are not involved
    // do not use ADT as it may cause memory overhead (why memory over head - because every ADT
    // takes lock internally hence this may consume memory).

    // Use all these solutions (MUTEX, SYNCHRONIZED BLOCKS & METHODS and ADT,
    // only when dealing with Shared Data in a multithreaded env.
    
    // Atomic Data Types work on Compare and Swap Algorithm (READ ABOUT THIS).
}
