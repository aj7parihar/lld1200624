package in.aj7parihar.lldoops2200624.lld1class4.inheritance;

public class Lion extends Cat{
    Lion(String name) {
        super(name);
        System.out.println("Lion: " + name);
    }
    // Compile Time Polymorphism - Method Overloading
    // Run Time Polymorphism - Method Overriding -- Dynamic or Late Binding
    void fun(){
        System.out.println("Lion fun");
    }
    void fun(int x){
        System.out.println(x);
    }
    void fun(double x){
        System.out.println(x);
    }
    @Override
    public void whoAmI(){
        System.out.println("I am a Lion");
    }
}
