package COnstructor.TypesOfConstructor;

class Student{
    String name;
    private Student(){

        System.out.println("Private Constructor");
    }
    // create a public static method
    public static void instanceMethod() {

        // create an instance of Test class
        Student obj = new Student();
    }
}

public class PrivateNoArgConstructor {

    public static void main(String[] args) {
        Student.instanceMethod();

    }
}
