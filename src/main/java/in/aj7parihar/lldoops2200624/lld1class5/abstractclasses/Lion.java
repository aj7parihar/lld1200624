package in.aj7parihar.lldoops2200624.lld1class5.abstractclasses;

public class Lion extends Animal{
    // Java does not support multiple inheritance i.e. Class cannot extend multiple classes.
    // Famous problem based on this is Diamond problem.
    // i.e., public class Lion extends Animal, Whale -- wrong.
    // C++ allows this via referring to only the first class that is in the extends list

    // Hence in-order to avoid this, Java allows to implement multiple interfaces, like
    // public class D implements A,B,C {}

    // It will have to implement one Abstract method.
    @Override
    void move() {
        System.out.println("Lion moves");
    }

    // Karan said in this class that when we want to implement same behaviour across
    // different classes then we use interface and implement it.
    // But when we do not know how will a particular method will behave then we use Abstract.
    // Key diff. b/w Interface and Abstract
}
