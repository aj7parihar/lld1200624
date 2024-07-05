package in.aj7parihar.lldoops2200624.lld1class5.abstractclasses;

public class Client {
    public static void main(String[] args) {
        demoAbstractClass();
    }
    public static void demoAbstractClass() {
        // Animal a = new Animal(); - 'Animal' is abstract; cannot be instantiated
        Animal a = new Lion();
        a.eat(); // This is because of Inheritance, that it is implementing the Parent class method
        // without even declaring in child class.
        a.move();

        Whale w = new BlueWhale();
        // This is because of Inheritance, that it is implementing the Parent class method
        // without even declaring in child class.
        w.eat();
        w.move();
    }
}
