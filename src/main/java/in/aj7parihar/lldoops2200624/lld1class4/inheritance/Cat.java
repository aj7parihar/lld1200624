package in.aj7parihar.lldoops2200624.lld1class4.inheritance;

public class Cat extends Mammal {
    Cat(String name) {
        // super() - When a child class extends its parent then automatically super() is their.
        // Super() calls their parent cons. before child cons. or anything inside child.
        super(name);
        System.out.println("Cat: " + name);
    }
    @Override
    public void whoAmI(){
        System.out.println("I am a Cat");
    }
}
