package COnstructor;


class P{

}
class C extends P{
    C (int i){

    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        //Hence inheritance is not applicable
        //C c=new C();

    }
}
   /* PS D:\JavaByDurgaSir\Java\src\COnstructor> javac ConstructorInheritance.java
        ConstructorInheritance.java:15: error: constructor C in class C cannot be applied to given types;
        C c=new C();
                ^
                required: int
                found: no arguments
                reason: actual and formal argument lists differ in length

*/