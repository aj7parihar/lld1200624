package in.aj7parihar.lldoops2200624.lld1class5.interfaces;

public class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    // this is implementing method of Animal Interface hence overriding is optional, but
    // writing @override makes it more readable.
    public void move() {
        System.out.println("Lion moves");
    }
}
