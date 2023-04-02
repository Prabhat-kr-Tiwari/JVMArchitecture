package COnstructor.SuperAndThisKeyword;
class Parent {
    String name = "Parent";

}
class child extends Parent {
    String name = "Child";

    public void print() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        child c = new child();
        c.print();

    }

}

