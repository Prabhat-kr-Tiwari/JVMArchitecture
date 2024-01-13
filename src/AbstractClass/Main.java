package AbstractClass;



// Abstract class
abstract class AbstractClass {
    // Abstract method
    public abstract void abstractMethod();

    // Non-abstract method
    public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in the abstract class.");
    }
}

// Interface
interface Interface {
    void interfaceMethod();
}

// Subclass implementing the abstract class and interface
class Subclass extends AbstractClass implements Interface {
    // Implementing abstract method from AbstractClass
    public void abstractMethod() {
        System.out.println("This is the implementation of abstractMethod() in Subclass.");
    }

    // Implementing method from Interface
    @Override
    public void interfaceMethod() {
        System.out.println("This is the implementation of interfaceMethod() in Subclass.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.abstractMethod();
        subclass.nonAbstractMethod();
        subclass.interfaceMethod();
    }
}

