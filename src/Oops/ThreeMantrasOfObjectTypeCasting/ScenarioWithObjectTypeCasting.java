package Oops.ThreeMantrasOfObjectTypeCasting;


class Parent {
    void m1() {
        System.out.println("parent");
    }

}

class Child extends Parent {
    void m2() {
        System.out.println("child");
    }

}

public class ScenarioWithObjectTypeCasting {
    public static void main(String[] args) {
        Child c=new Child();
        c.m2();
        c.m1();
        ((Parent)c).m1();
       // ((Parent)c).m2();

    }
}
