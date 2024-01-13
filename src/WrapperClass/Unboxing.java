package WrapperClass;

public class Unboxing {
    public static void main(String[] args) {
        Integer i=new Integer(10);
        int ab=i.intValue();
        int j=i;//unboxing
        System.out.println(i);
        System.out.println(ab);
        System.out.println(j);
    }
}
