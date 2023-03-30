package ClassLevelModifier;

class A{
    private void m3()
    {
        System.out.println("A class private method");
    }

}
public class privateModifier {
    public static void main(String[] args) {
        A a=new A();
       // a.m3();
    }
}
