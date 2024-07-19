package in.aj7parihar.lldoops2200624.lld1class12.functionalinterface;

import org.apache.logging.log4j.util.BiConsumer;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        demoFunctionalInterface();
    }
    public static void demoFunctionalInterface() {
        // 'SampleFunctionalInterface' is abstract; cannot be instantiated, implement its methods
        // SampleFunctionalInterface obj = new SampleFunctionalInterface();

        SampleFunctionalInterface obj = new SampleFunctionalInterface() {
            @Override
            public void fun() {
                // We write our body here in this case just print
                System.out.println("Calling fun() - Raw Implementation of FunctionalInterface as Anonymous Class");
                // Raw bole toh, explicitly by creating our own sample interface "SampleFunctionalInterface"
            }

            // Even if the interface is not Functional Interface i.e. normal interface having
            // more than one abstract methods then also we can implement it as Anonymous Class, and in that
            // anonymous class we have to implement all it's methods.
            // Please do not the above statement is not true for Lambda Functions, i.e. they can be
            // implemented only for Functional Interfaces.
//            @Override
//            public void fun1(){
//                System.out.println("Calling fun1() - Implementation of Any Interface as Anonymous Class");
//            }

        };
        obj.fun();
//        obj.fun1();
        // Above implementation of Functional Interface or Normal Interface is known as Anonymous class,
        // this is what we talked in AnonymousClass.txt about Runnable Interface.

        System.out.println();

        // Runnable runnable = new Runnable(); - 'Runnable' is abstract; cannot be instantiated, implement its methods.
        // But below implementation is possible through Anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Calling run() - Implementation of Runnable Interface as Anonymous Class");
            }
        };
        runnable.run();

        System.out.println();

        // Implementing few more Functional Interfaces as Anonymous Class
        Consumer<String> consumer = new Consumer<String>() {
          @Override
          public void accept(String s) {
              System.out.println(s + " is my Country " + " - Implementation of Consumer Interface as Anonymous Class");
          }
        };
        consumer.accept("India");

        System.out.println();

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "'s populations in billions is " + integer + " - Implementation of BiConsumer Interface as Anonymous Class");
            }
        }; // ; denotes end of line or statement
        biConsumer.accept("India", 140);

        // Similarly we can implement other functional interfaces such as -
        // Predicate<T> & BiPredicate<T, V> - by implementing "test()" method with return type as Bool
        // Function<T, R> & BiFunction<T, V, R> - by implementing "apply()" method with return type as R
    }
}
