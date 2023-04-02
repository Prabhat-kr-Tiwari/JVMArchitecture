package COnstructor.SuperandThisConstructorCall;

public class SuperAndThisCannotbeUsedSimulatneously {
    public SuperAndThisCannotbeUsedSimulatneously() {
        super();
        //Call to 'this()' must be first statement in constructor body
        //this();
        System.out.println("Constructor");
    }
}
