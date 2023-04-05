package COnstructor.TypesOfConstructor;


class Company{
    String name;
    public Company(){
        name="Tiwari";
        //System.out.println("Public Constructor");
    }
}
public class publicNoArgConstructors {

    public static void main(String[] args) {
        Company c=new Company();
        System.out.println(c.name);


    }
}
