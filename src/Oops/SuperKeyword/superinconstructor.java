package Oops.SuperKeyword;

/*
How is the super keyword used to call the constructor of the superclass?
Answer: When creating an object of a subclass, the constructor of the superclass is called implicitly
before the constructor of the subclass. However, if the superclass has a parameterized constructor,
 we need to use the super keyword to call the superclass constructor explicitly with the required
 arguments. This is done using the super() method call, which should be the first statement in the
 constructor of the subclass.
*/
class C{
    public C(int i) {

        System.out.println("I am in class C");
    }
}
public class superinconstructor extends C{


    public superinconstructor() {
        super(5);

        System.out.println("i am in superinconstructor");

    }

    public static void main(String[] args) {
        superinconstructor obj=new superinconstructor();
    }
}
