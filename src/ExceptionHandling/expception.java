package ExceptionHandling;


class CustException extends Exception{
    CustException(String msg){
        super(msg);

    }
}
public class expception {
    public static void main(String[] args) {
        int age=16;
        try {
            if (age<18) throw new CustException("Age is below 18");
            else{
                System.out.println("Eligible");
            }

        }catch (CustException e){
            System.out.println(e);
        }
    }
}
