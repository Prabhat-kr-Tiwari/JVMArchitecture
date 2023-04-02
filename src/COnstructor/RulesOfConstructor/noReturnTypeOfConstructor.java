package COnstructor.RulesOfConstructor;

public class noReturnTypeOfConstructor {

    void noReturnTypeOfConstructor(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        noReturnTypeOfConstructor t=new noReturnTypeOfConstructor();
        noReturnTypeOfConstructor t2=new noReturnTypeOfConstructor();
        t.noReturnTypeOfConstructor();
    }
}
