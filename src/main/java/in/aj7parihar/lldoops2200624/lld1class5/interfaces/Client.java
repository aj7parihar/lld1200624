package in.aj7parihar.lldoops2200624.lld1class5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInterface();
    }
    private static void demoInterface() {
        // Animal a = new Animal(); -- 'Animal' is abstract; cannot be instantiated

//        Lion lion = new Lion();
//        lion.eat();
//        lion.move();

        // Another way of creating an object of Lion class is using Inheritance -
        // Kind of better way of invoking child (derived) class methods.
//        Animal animal1 = new Lion();
//        animal1.eat();
//        animal1.move();
//        animal1.fly(); // this will print the message inside the 'default' method

//        Animal animal2 = new Eagle();
//        animal2.eat();
//        animal2.move();
//        animal2.fly(); // this will override the 'default' method inside Animal and will implement
        // Eagle's fly()

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Eagle());

        for (Animal animal : animals) {
            animal.eat();
            animal.move();
            animal.fly();
        }
    }
}
