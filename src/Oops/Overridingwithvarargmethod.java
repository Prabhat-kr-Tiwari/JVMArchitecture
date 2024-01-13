package Oops;


class P{
    void m1(int... i)
    {
        System.out.println("Parent");
    }

}
class c extends P{
//    void m1(int i)
//    {
//        System.out.println("Child");
//    }
void m1(int ... i)
{
    System.out.println("Child");
}
}


public class Overridingwithvarargmethod extends P{


    public static void main(String[] args) {
        P p=new P();
        p.m1(10);
        c c=new c();
        c.m1(10);
        P p1=new c();
        p1.m1(10);

    }


}
