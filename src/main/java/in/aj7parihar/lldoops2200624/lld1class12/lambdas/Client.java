package in.aj7parihar.lldoops2200624.lld1class12.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

public class Client {
    public static void main(String[] args){
        // demoLambdaFunction();
        // demoRunnableLambdaFunction();
        // demoPredicateLambdaFunction();
        demoComparator();
    }

    public static void demoLambdaFunction() throws Exception {
        // Functional Interface - Implementation as Lambda Function

        // Consumer & BiConsumer Functional Interface
        Consumer<String> consumer = (str) -> {
            System.out.println(str + " is my Country " + " - " +
                    "Implementing Consumer Interface as Lambda Function");
        };
        consumer.accept("India");

        BiConsumer<String, Integer> biConsumer = (str, nums) -> {
            System.out.println(str + "'s population in billions is " + nums + " - " +
                    "Implementing BiConsumer Interface as Lambda Function");
        };
        biConsumer.accept("India", 140);


        // Function & BiFunction Functional Interface
        Function<Integer, Integer> function = (nums) -> {
            return nums;
        };
        System.out.println(function.apply(141));

        BiFunction<String, Integer, Integer> biFunction = (str, nums) -> {
            return nums;
        };
        System.out.println(biFunction.apply("India", 140));

        // Callable Functional Interface
        Callable<String> callable = () -> {
            return "Implementing Callable Interface as Lambda Function";
        };
        System.out.println(callable.call());
    }
    public static void demoRunnableLambdaFunction() {
        // Runnable Functional Interface
        Runnable runnable = () -> {
            // System.out.println(Thread.currentThread().getName() + " - Implementing Runnable Interface as Lambda Function");
            System.out.println("Implementing Runnable Interface as Lambda Function");
        };
        runnable.run();

        // For printing 1 to 10 using threads
//        for(int i=1; i<=10; i++){
//            Thread thread = new Thread(runnable);
//            thread.start();
//        }

        // The above Runnable interface can also be implemented in another way using Lambda function
        Thread thread = new Thread( () -> System.out.println(Thread.currentThread().getName() + " - Implementing Runnable Interface as Lambda Function"));
        thread.start();
    }
    public static void demoPredicateLambdaFunction() {
        // Predicate & BiPredicate Functional Interface
        Predicate<String> predicate = (str) -> {
            if (str.length() > 5) {
                return true;
            }
            return false;
        };
        System.out.println(predicate.test("India"));

        // more precise way
        Predicate<String> predicate2 = (str) -> { return str.length() > 5; };
        System.out.println(predicate2.test("India"));

        // OR this way
        Predicate<String> predicate3 = str -> str.length() < 5;
        System.out.println(predicate3.test("India"));

        BiPredicate<String, Integer> biPredicate = (str, nums) -> {
            if (str.equals("India") && nums == 141) {
                return true;
            }
            return false;
        };
        System.out.println(biPredicate.test("India", 141));
    }

    public static void demoComparator(){
        List<Student> students = Arrays.asList(
                new Student("Ajay", 400, 123),
                new Student("Vijay", 400, 124),
                new Student("Sanjay", 420, 125),
                new Student("Karan", 500, 132),
                new Student("Souvik", 200, 144)
        );

        Comparator<Student> marksComparator = (st1, st2) -> {
            return st1.marks - st2.marks;
        };
        // students.sort(marksComparator);
        Collections.sort(students, marksComparator);
        System.out.println(students);

        Comparator<Student> rollNumComparator = (st1, st2) -> {
            return st1.rollNum - st2.rollNum;
        };
        students.sort(rollNumComparator);
        System.out.println(students);

        // For desc. order just reverse the order i.e. st2.marks - st1.marks;
    }

}
