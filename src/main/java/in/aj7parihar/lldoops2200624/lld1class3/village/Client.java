package in.aj7parihar.lldoops2200624.lld1class3.village;

public class Client {
    public static void main(String[] args) {
        demoAccess();
    }

    public static void demoAccess() {
        Family family = new Family();

        // System.out.println(family.privateAttribute);
        System.out.println(family.defaultAttribute);
        System.out.println(family.protectedAttribute);
        System.out.println(family.publicAttribute);
    }
}
