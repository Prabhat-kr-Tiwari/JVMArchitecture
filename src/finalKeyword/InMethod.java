package finalKeyword;


class Demo{
    final void show(){
        System.out.println("In Demo");

    }
}
public class InMethod extends Demo {
    //final method cannot be ovverriden
    /*
    @Override
     void show(){
        System.out.println("In method");

    }*/

}
