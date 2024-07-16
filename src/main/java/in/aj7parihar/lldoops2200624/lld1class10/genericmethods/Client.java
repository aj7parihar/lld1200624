package in.aj7parihar.lldoops2200624.lld1class10.genericmethods;

public class Client {
    public static void main(String[] args) {
        demoGenericMethod();
    }
    public static void demoGenericMethod() {
        // If we see below, by creating a Generic Method we are able to pass
        // any type of value to it, just like in Raw Data Types but unlike Generic class
        // where we need to define the data type.
        // And Java does this by using "Type Inference", that means just by looking
        // at the parameter Java will infer that it is a String or integer, etc.
        GenericMethod p1 = new GenericMethod();
        p1.fun("India");
        p1.fun(140);
        p1.fun(11.3746565767);
        p1.fun(true);

        System.out.println();

        GenericMethod p2 = new GenericMethod();
        System.out.println(p2.fun("India", 140));
        System.out.println(p2.fun(140, "India"));
        System.out.println(p2.fun(11.3746565767, 44.26532424));
        System.out.println(p2.fun("India", true));

        System.out.println();

        // Static Generic Method -
        GenericPair.fun("India");
        GenericPair.fun(140);
        GenericPair.fun(11.3746565767);
        GenericPair.fun(false);

        // This is also Type Inference but kind of redundant.
        GenericPair.<Boolean>fun(true);
        GenericPair.<String>fun("UK");

        // Raw Data Types did not provide Compile time safety but with the introduction
        // of Generics since Java 5 this problem was solved.
        // Now came the problem of Backward Compatibility i.e. with introduction of new
        // feature old one should keep working, hence we had to make both Generics & Raw
        // Data Types to behave same during runtime, and in order to solve this problem
        // we have Type Erasure.
        // Type Erasure - Replacing Generic types with "Bound" at runtime.
        // Two types of Type Erasure -
        // 1. Unbounded - List<T or E> is directly converted to Object during runtime.
        // 2. Bounded - Replaced with first Bound

        //Bounds in Generic -
        // Upper Bound
        // void fun(List< ? extends Animal) - Animal is upper Bound, anything that extends Animal

        // Lower Bound
        // void fun(List< ? super cat) - cat is lower bound, anything that is above Cat

        // Multiple Bounds
        // class ClassName( ? extends classA & Implements A, B)
    }
}
