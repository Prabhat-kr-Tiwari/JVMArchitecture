package ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) throws CustomException {
        try {
            performOperation();
        }catch (CustomException e){
            System.out.println("Caught Exception"+e.getMessage());
        }
    }

    private static void performOperation() throws CustomException {
        boolean errorCondition=true;
        if (errorCondition){
            throw new CustomException("An error occurred during execution");
        }
        System.out.println("Operation completed successfully");
    }

}
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
