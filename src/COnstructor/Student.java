package COnstructor;

public class Student {

    String name;
    int rollno;
    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Student s=new Student("Prabhat",101);
        System.out.println("Name:  "+s.name);
        System.out.println("Roll no:  "+s.rollno);
    }

}
