package Oops.SuperKeyword;


class A{

    void m1(){
        System.out.println("I am in class A");
    }

}

public class superkeywordinmethod extends A {


    void m1(){
        System.out.println("I am in class B");
    }
    void show(){
        super.m1();
        m1();
    }

    public static void main(String[] args) {
        superkeywordinmethod obj=new superkeywordinmethod();
        obj.show();

    }


}
