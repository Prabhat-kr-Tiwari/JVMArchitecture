package COnstructor;

public class numberOfTimesConstructorCalled {

    public numberOfTimesConstructorCalled() {

        System.out.println("constructor called");
    }

    public static void main(String[] args) {
        numberOfTimesConstructorCalled n=new numberOfTimesConstructorCalled();
        numberOfTimesConstructorCalled n2=new numberOfTimesConstructorCalled();
        numberOfTimesConstructorCalled n3=new numberOfTimesConstructorCalled();
    }
}

