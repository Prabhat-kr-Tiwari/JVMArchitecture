package Package.Pack3;



public class C {
    protected void m3(){
        System.out.println("Protected method of class C");
    }
}
class D extends C{
    C c=new C();
    C d=new D();
   // d.m3();
}

