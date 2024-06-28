package in.aj7parihar.lldoops2200624.lld1class3.village;

public class Family {
    private String privateAttribute;
    Integer defaultAttribute;
    protected boolean protectedAttribute;
    public String publicAttribute;

    void checkAccess(){
        System.out.println(privateAttribute);
        System.out.println(defaultAttribute);
        System.out.println(protectedAttribute);
        System.out.println(publicAttribute);
    }

    class SubFamily{
        void checkAccess(){
            System.out.println(privateAttribute);
        }
    }
}