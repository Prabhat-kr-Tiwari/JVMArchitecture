package JVMArchitectureByDurgaSir;

import java.lang.reflect.Method;

class Student{
    public String getName(){
        return null;
    }
    public int getMarks(){
        return 10;
    }
}

public class FindNumberOfMethodsInClass {
    public static void main(String[] args) throws ClassNotFoundException {
        int count=0;
        Class<?> c= Class.forName("Student");
        Method[] m=c.getDeclaredMethods();
        for (Method m1:m){
            count++;
            System.out.println(m1.getName());

        }
        System.out.println("The number of methods are"+count);

    }
}
