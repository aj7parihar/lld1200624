package in.aj7parihar.lldoops2200624.lld1class3.constructors;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoConstructor();
    }
    public static void demoConstructor() {
        // Demoing default constructor that is created at run time but code provided at compile time.
        // Student s = new Student(); // It will assign the default values to data members
        // like null for String, 0 for int, false for boolean, 0.0 for double, etc.
        // s= @783 , created an object in the memory at this physical address

        // Student s1 = new Student();

        List<Integer> marks = new ArrayList<>();
        marks.add(11);
        marks.add(12); // Lists are not immutable that means I have changed the value from
        // 1 to 11 & 2 to 12, so it has not created a new list in the heap, rather update the same list.
        Student s2 = new Student("Ajay", 29, 93, marks);

        // Create a copy of constructor
        // Student s3 = new Student();
        // s3 = s2; // This will not create a new copy of the constructor rather will point to the
        // existing object in the heap memory, where s1 was pointing.

        Student s4 = new Student(s2);

        // to show Shallow Copy - We have made the copy in line 28, so ideally only marks 1 & 2
        // should have been copied but after adding marks at line 32 we see in the debug mode that
        // marks at line 32 have also been copied to the constructor, this is called
        // SHALLOW COPY
        // In Shallow Copy the problem is that "the address is copied" so whatever is changed
        // in the address it will reflect everywhere.
        // In shallow copy everyone has the same heap memory address.

        // For string variable also the shallow copy is created, see in debug mode

        marks.add(3);

        // To show Strings are immutable - Earlier it was pointing to same String "Ajay" in the memory
        // but since Strings are immutable so instead of destroying it, the new String is created in
        // heap memory, to which s4 is only pointing (like deep copy).
        s4.setName("Shivani");

        // Deep Copy - Everyone has different heap memory address.
        // Learn more about Deep Copy??

        System.out.println("Debug");
    }
}
