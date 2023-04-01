package COnstructor;

public class needOfConstructor {

    String name;
    int rollno;

    public static void main(String[] args) {
        needOfConstructor s=new needOfConstructor();
        needOfConstructor s2=new needOfConstructor();
        System.out.println("s");
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println("s2");

        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
}
