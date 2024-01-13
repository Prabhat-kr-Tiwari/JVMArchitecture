package DeepakSir.Multithreading;

public class Test extends Thread{

    public void run(){

        System.out.println("Thread task");
    }

    public static void main(String[] args) {




        Test t=new Test();
        //here thread is created
        t.start();
//
//        if we call again then it will create runtime exception
//        t.start();
        //this simple method call
//        t.run();


    }
}
