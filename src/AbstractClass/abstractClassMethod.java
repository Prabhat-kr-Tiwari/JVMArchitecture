package AbstractClass;

public class abstractClassMethod {


}


abstract class Parent{

    public abstract void a();
    public abstract void b();
}
// child class must implement all the method of abstract class otherwise we will get compile time error

class child extends Parent{


    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
