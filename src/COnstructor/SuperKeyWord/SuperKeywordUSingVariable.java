package COnstructor.SuperKeyWord;


class A{
    int i=10;
}class C extends  A{

    int i=20;
    void  show(int i){
        System.out.println("Without Using any Keyword");
        System.out.println(i);
        System.out.println(" Using this Keyword");
        System.out.println(this.i);

        System.out.println("With Using Super Keyword");
        System.out.println(super.i);
    }
}
public class SuperKeywordUSingVariable extends C{

    public static void main(String[] args) {
        C c=new C();
       c.show(30);
    }
}
