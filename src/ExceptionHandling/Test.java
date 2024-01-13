package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        /*System.out.println("1");
        System.out.println("2");
        System.out.println(100/2);
        System.out.println(100/0);*/
       // FileInputStream fis=new FileInputStream("e:/MCA/sem2/JAVA/abc.txt");
       // Class.forName("com.mysql.jdbc.Driver");
        /*int a=100,b=0,c;
        c=a/b;
        System.out.println(c);*/
        String str = "Programming in java.";
        System.out.println(str.charAt(4)+str.substring(8, 11));

    }
}
