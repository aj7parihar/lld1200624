package in.aj7parihar.lldoops2200624.lld1class5.interfaces;

public class Eagle implements Bird {
    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void move() {
        System.out.println("Eagle move");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }
}
