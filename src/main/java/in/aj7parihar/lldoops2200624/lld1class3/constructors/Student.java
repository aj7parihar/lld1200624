package in.aj7parihar.lldoops2200624.lld1class3.constructors;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    String name;
    int age;
    double psp;
    private List<Integer> grades;

    // Constructors -
    // Same name as class
    // Kind of function that has no return type not even void in the signature
    // Implicitly return the created object
    // If we do not write our own (manual constructor) Java creates a default constructor.
    // Two types - Parametrized & Non Parametrized

    // Default constructor does two things:
    // 1. Instantiates (instance of the class in heap) i.e. implicitly creates an object for the class in the Heap,
    // like in our case, "s = @783", see Client class debug.
    // 2. Initializes the data members to default.

    // Default Constructor but by defining it we have overriden
    public Student() {
        // do nothing
    }

    // Now if we want to set values to data members we can define our own constructor
    // Once we define our own constructor the default one is no more available

    // Manual or Parameterized Constructor
    public Student(String name, int age, double psp, List<Integer> grades) {
        // As soon we (jvm)?? come across line 23 the object is instantiated with default values.

        // Que. - What is "this" called here?
        // Ans. - "this" keyword refers to the current object in a constructor or method.

        // Que. - What if we remove "this" keyword?
        // Ans. - It becomes confusing, we can see this in Copy Constructor

        this.name = name;
        this.age = age;
        this.psp = psp;
        this.grades = grades;
    }

    // copy constructor
    public Student(Student s) {
        this.name = s.name; // if we remove this from here it will become confusing
        this.age = s.age;
        this.psp = s.psp;
        this.grades = s.grades;
    }
}
