package in.aj7parihar.lldoops2200624.lld1class3.anothervillage;

import in.aj7parihar.lldoops2200624.lld1class3.village.Family;

public class DistantRelative extends Family {

    private void demoAccess() {

        Family family = new Family();
        // not required here as we are extending the class itself.

        // System.out.println(family.privateAttribute);
        // System.out.println(family.defaultAttribute);

        // why not this?
        // System.out.println(family.protectedAttribute);

        // why this?
        System.out.println(protectedAttribute);

        System.out.println(publicAttribute);
    }
}
