package WrapperClass;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Using the Boolean wrapper class
        Boolean boolObj = Boolean.valueOf(true); // Wrapping a boolean value
        System.out.println("Boolean Value: " + boolObj);

        // Using the Double wrapper class
        Double doubleObj = Double.valueOf(3.14); // Wrapping a double value
        System.out.println("Double Value: " + doubleObj);

        // Using the Integer wrapper class
        Integer intObj = Integer.valueOf(42); // Wrapping an integer value
        System.out.println("Integer Value: " + intObj);

        // Unwrapping the values from the wrapper objects
        /*boolean boolValue = boolObj.booleanValue();
        double doubleValue = doubleObj.doubleValue();
        int intValue = intObj.intValue();*/
        boolean boolValue = boolObj;
        double doubleValue = doubleObj;
        int intValue = intObj;

        // Performing operations with the unwrapped values
        System.out.println("Addition: " + (intValue + doubleValue));
        System.out.println("Boolean AND: " + (boolValue && true));
    }
}

