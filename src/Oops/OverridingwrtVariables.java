package Oops;


class Parent{
    static String s="Parent";
}class Child extends Parent{
    String  s="Child";

}
public class OverridingwrtVariables extends  Child{
    public static void main(String[] args) {

        Parent p=new Parent();
        System.out.println(p.s);

        Child c=new Child();
        System.out.println(c.s);

        Parent p1=new Child();
        System.out.println(p1.s);

    }
}
