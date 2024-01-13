package Oops.FinalKeyword;

class Demo{
    final void show(){
        System.out.println("In Demo");
    }
}
public class InMethod extends Demo{
    //@Override
    //how()' cannot override 'show()' in 'Oops.FinalKeyword.Demo'; overridden method is final
   /* void show(){
        System.out.println("IN Method class");
    }*/

    public static void main(String[] args) {


    }
}
