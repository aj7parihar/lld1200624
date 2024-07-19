package in.aj7parihar.lldoops2200624.lld1class12.functionalinterface;

@FunctionalInterface
public interface SampleFunctionalInterface {
    public void fun();

    // If we create below abstract method then we will get compilation error or
    // get red line under @FunctionalInterface stating:
    // "Multiple non-overriding abstract methods found in
    // interface in.aj7parihar.lldoops2200624.lld1class12.functionalinterface.SampleFunctionalInterface,
    // remove abstract method fun1()."

//    void fun1();

    // Hence FunctionalInterface supports Single Abstract Method (SAM) only, it can have default or concrete
    // methods but only one SAM.
}
