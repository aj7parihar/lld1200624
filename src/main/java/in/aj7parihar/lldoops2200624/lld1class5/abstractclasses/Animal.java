package in.aj7parihar.lldoops2200624.lld1class5.abstractclasses;

public abstract class Animal {
    int limbs;
    String name;

    abstract void move();
    // void eat(); -- If we declare this as it is, IntelliJ gives below error:
    // "Missing method body, or declare abstract"
    void eat(){
        System.out.println("Animal eats");
    }
}
