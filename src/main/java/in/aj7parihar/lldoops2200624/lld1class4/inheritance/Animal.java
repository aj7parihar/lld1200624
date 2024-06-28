package in.aj7parihar.lldoops2200624.lld1class4.inheritance;

public class Animal {
    Animal(String name){
        System.out.println("Animal: " + name);
    }
    // @Override -- Method does not override method from its superclass
    public void whoAmI(){
        System.out.println("I am an Animal");
    }
}
