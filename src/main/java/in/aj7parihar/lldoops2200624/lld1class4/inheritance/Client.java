package in.aj7parihar.lldoops2200624.lld1class4.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
    }
    public static void demoInheritance() {
        Lion lion = new Lion("Leo");
        lion.fun();
        lion.fun(5);
        lion.fun(5.0);
        lion.whoAmI();

        Animal a = new Mammal("LLeo"); // LEARN THIS IN DEPTH???
        a.whoAmI(); // this will override the function call and will call the function of
        // its own class

        // We have created an object of type Cat() but reference is parent class, why??
        // Ans -
        a = new Cat("Caty");
        a.whoAmI();

        a = new Lion("Babbar Sher");
        a.whoAmI();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Mammal("Elephant"));
        animals.add(new Cat("Goldy"));
        animals.add(new Lion("Roger"));
        animals.add(new Dog("Cheeku"));

        for(Animal animal : animals) {
            // System.out.println(animal); -- this will print physical address of each object
            animal.whoAmI();
        }
        // Do we see, what's happening here?
        // So instead of creating object of each class, we have created object of base/super
        // class and using that we are calling the methods of derived class, this is called
        // Run Time Polymorphism.
        // This is decoupling or loose coupling.

        // Note: Only Parent can hold the reference of different kind of child class

        System.out.println("Inheritance Demo");
    }

}
