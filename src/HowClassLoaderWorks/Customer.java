package HowClassLoaderWorks;
/*
C:\Users\prabhat>D:

D:\>cd JavaByDurgaSir\Java\src\HowClassLoaderWorks

D:\JavaByDurgaSir\Java\src\HowClassLoaderWorks>ls
Customer.java

D:\JavaByDurgaSir\Java\src\HowClassLoaderWorks>javac Customer.java

D:\JavaByDurgaSir\Java\src\HowClassLoaderWorks>jar -cvf cust.jar Customer.class
added manifest
adding: Customer.class(in = 281) (out= 216)(deflated 23%)

D:\JavaByDurgaSir\Java\src\HowClassLoaderWorks>
*/
public class Customer {
    public static void main(String[] args) {

    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(Test.class.getClassLoader());
        System.out.println(Customer.class.getClassLoader());
    }
}
