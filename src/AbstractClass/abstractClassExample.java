package AbstractClass;


import ClassLevelModifier.Pack2.B;

abstract class vehicle {

    abstract int getNoOfWheels();

}
class Auto extends vehicle{

    @Override
    int getNoOfWheels() {
        return 3;
    }
}
class Bus extends vehicle{

    @Override
    int getNoOfWheels() {
        return 6;
    }
}

public class abstractClassExample {
    public static void main(String[] args) {
        Bus b=new Bus();
        System.out.println(b.getNoOfWheels());
        Auto a=new Auto();
        System.out.println(a.getNoOfWheels());
    }
}
