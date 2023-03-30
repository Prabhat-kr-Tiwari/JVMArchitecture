package AbstractClass;


abstract class Test1{

    abstract void m5();
    abstract void m6();


}

abstract public class SubTest extends Test1{
    public void m5(){

    }
}
//in the subtest only m5 method is provided implementation so we cannot create object of abstract class
class SubSubTest extends SubTest{
    @Override
    public void m6() {

    }
}
