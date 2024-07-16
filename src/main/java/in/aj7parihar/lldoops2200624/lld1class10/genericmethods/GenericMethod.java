package in.aj7parihar.lldoops2200624.lld1class10.genericmethods;

public class GenericMethod {
    Object first;
    Object second;

    // For every generic method we need to give generic placeholder before the return type.
    // In C++ we have "template" for the same
    public <T> void fun(T data){
        System.out.println(data);
    }

    // method overloading
    // Here placeholders are <T, X> and it placed before the return type X
    public <T, X> X fun(T data, X data2){
        System.out.println(data);
        return data2;
    }

    // Raw Data Types did not provide Compile time safety but with the introduction
    // of Generics since Java 5 this problem was solved.
    // Now came the problem of Backward Compatibility i.e. with introduction of new
    // feature old one should keep working, hence we had to make both Generics & Raw
    // Data Types to behave same during runtime, and in order to solve this problem
    // we have Type Erasure.
    // Type Erasure - Replacing or Erasing data type of Generics with "Bound" at runtime.
    // Two types of Type Erasure -
    // 1. Unbounded - List<T or E> is directly converted to Object during runtime.
    // 2. Bounded - Replaced or Erased with first Bound

    //Bounds in Generic -
    // Upper Bound
    // void fun(List< ? extends Animal) - Animal is upper Bound, anything that extends Animal

    // Lower Bound
    // void fun(List< ? super cat) - cat is lower bound, anything that is above Cat

    // Multiple Bounds
    // class ClassName( ? extends classA & Implements A, B)
}