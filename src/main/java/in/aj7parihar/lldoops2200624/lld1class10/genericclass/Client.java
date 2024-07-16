package in.aj7parihar.lldoops2200624.lld1class10.genericclass;

public class Client {
    public static void main(String[] args) {
        demoGenerics();
        demoPair();
    }
    public static void demoGenerics() {
        // When doing DI using Constructor
        // GenericPair<String, Integer> p1 = new GenericPair<>("India", 140);

        // DI using Setters
        GenericPair<String, Integer> p1 = new GenericPair<>();
        p1.setFirst("India");
        p1.setSecond(140);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        // Now after using Generics it is giving the error in compile time itself
        // double population = (String)pair.getFirst();
        // String name = (double)pair.getSecond();

        // If we see in below method, it was allowing the object to hold any kind of value but
        // in generics it is not allowed i.e.
        // p1.setFirst(140) AND p1.setSecond("India") is not allowed, and we will get error in compile
        // time itself.

        GenericPair<Double, Double> p2 = new GenericPair<>();
        p2.setFirst(33.144444546);
        p2.setSecond(52.14563465);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());

    }
    public static void demoPair() {
        Pair p1 = new Pair();
        p1.first = 140;
        p1.second = "India";

        // The below was asked in Advance Contest - 1, not an ideal way but this is also allowed i.e.
        // instance can access the static attributes and behaviours.
//        Pair p2 = new Pair();
//        p1.x = 20;
//        System.out.println(p1.x + " " + p2.x);

        // Below type cast will give run time error and not compile time error
//        String name = (String)p1.first;
//        double population = (double)p1.second;
//        System.out.println(name);
//        System.out.println(population);
    }
}
