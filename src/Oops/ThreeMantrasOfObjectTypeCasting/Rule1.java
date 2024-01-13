package Oops.ThreeMantrasOfObjectTypeCasting;

public class Rule1 {

    public static void main(String[] args) {
        Object o=new String("Durga");
        //StringBuffer sb=(StringBuffer) o;

        /*String s=new String("Hello");
        StringBuffer sbb=(StringBuffer) s;*/

        String s=new String("Hello");
        String sbb=(String) s;
        System.out.println(sbb);
    }
}
