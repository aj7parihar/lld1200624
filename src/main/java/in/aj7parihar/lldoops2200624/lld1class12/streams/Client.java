package in.aj7parihar.lldoops2200624.lld1class12.streams;

import in.aj7parihar.lldoops2200624.lld1class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoStreams();
    }
    public static void demoStreams() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = nums.stream().filter(x -> x%2 != 0).toList();

        System.out.println(oddNumbers);


        // Map students to marks
        List<Student> students = Arrays.asList(
                new Student("Ajay", 400, 123),
                new Student("Vijay", 400, 124),
                new Student("Sanjay", 420, 125),
                new Student("Karan", 500, 132),
                new Student("Souvik", 200, 144)
        );
        System.out.println(students.stream().map((student) -> student.marks).toList());

        // Convert list of strings to upper case
        List<String> students2 = Arrays.asList("Ajay", "Vijay", "Sanjay", "Karan", "Souvik");
        System.out.println(students2.stream().map(String::toUpperCase).toList());
        // :: --> Method reference operator, from String class it references to method "toUpperCase()"

        // HW - FlatMap (similar to flattening a LL)
    }
}
