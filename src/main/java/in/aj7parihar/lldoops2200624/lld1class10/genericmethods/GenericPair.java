package in.aj7parihar.lldoops2200624.lld1class10.genericmethods;

public class GenericPair<F, S> {
    // Generics in Java -
    // 1. Allows us to re-use the same code for different data types, in C++ & Python we have Pair<>
    // for this.
    // 2. Eliminates the use of type casting.
    // 3. Errors, if any, are caught in compile time itself, i.e. it provides compile time safety.

    // <F, S> are placeholders and will accept data types (in same order & type) that we are sending
    // from Client class i.e. if we have declared something like below in Client class
    // GenericPair<String, Integer> p1 = new GenericPair<>(); then it will accept like -
    // p1.setFirst("India"); AND p1.setSecond(140); but not like -
    // p1.setFirst(140); AND p1.setSecond("India");

    // Trivia -
    // "List" which is an interface is also a Generic class - check by doing ctrl+click
    // List<String> str = new ArrayList<String>();

    private F first;
    private S second;

//    public GenericPair(F first, S second) {
//        this.first = first;
//        this.second = second;
//    }

    // Setters - This could have been done by using lombok also
    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // Getters
    public F getFirst() {
        return this.first;
    }
    public S getSecond() {
        return this.second;
    }

    // Generic Static Method -
    // For every generic method we need to give generic placeholder before the return type.
    public static <T> void fun(T data){
        System.out.println(data);

    }
}
