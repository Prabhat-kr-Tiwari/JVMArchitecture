public class abstractclass
{
    public static void main(String[] args) {
        b cl = new b();
        cl.shabaj();
    }
}

abstract class test{
    void shabaj(){
        System.out.println("this is absatrat class function");
    }
}

interface test2{
    void method();
}

class b extends test{
    @Override
    public void shabaj(){
//        super.shabaj();
        System.out.println("this is overide shabaj");
    }
}

class a implements test2{

    @Override
    public void method(){
        System.out.println("this is interface class");
    }
}