package COnstructor.SuperandThisConstructorCall;

public class SuperMustBeAtFirstLineInConstructor {
    public SuperMustBeAtFirstLineInConstructor() {
        System.out.println("Constructor");
        //Call to 'super()' must be first statement in constructor body
        //super();
    }
}
