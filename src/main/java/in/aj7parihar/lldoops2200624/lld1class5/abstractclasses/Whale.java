package in.aj7parihar.lldoops2200624.lld1class5.abstractclasses;

public abstract class Whale extends Animal{
    // If we do not want to instantiate the Whale class then we can make it Abstract
    // and later create a specific instance of it.

    @Override
    void move() {
        System.out.println("Whale moves using fins");
    }
}
