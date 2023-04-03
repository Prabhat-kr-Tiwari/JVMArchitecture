package COnstructor;

public class ConstructorOverloading {

    public ConstructorOverloading (double d){
        this(10);
        System.out.println("Double arg constructor");
    }
    public ConstructorOverloading (int d){
        this();
        System.out.println("Int arg constructor");
    }
    public ConstructorOverloading (){

        System.out.println("no arg constructor");
    }

    public static void main(String[] args) {
        System.out.println("C1     ");
        ConstructorOverloading c1=new ConstructorOverloading(10.5);
        System.out.println("C2     ");

        ConstructorOverloading c2=new ConstructorOverloading(10);
        System.out.println("C3     ");
        ConstructorOverloading c3=new ConstructorOverloading();

    }

}
