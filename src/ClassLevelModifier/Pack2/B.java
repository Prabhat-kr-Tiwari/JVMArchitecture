package ClassLevelModifier.Pack2;

import ClassLevelModifier.Pack1.A;

public class B {
    public static void main(String[] args) {
        //System.out.println("public class in B in pack 2");
        A a=new A();
        A.m1();
    }
}
