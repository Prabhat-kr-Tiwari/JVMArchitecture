package DeepakSir.DifferentUseCase;


class Mythread1 extends Thread{
    public void run(){
        System.out.println("My task 1");
    }

}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("My task 2");
    }

}
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("My task");



    }

    public static void main(String[] args) {

        //performing single task from multiple thread
        MyThread myThread=new MyThread();
        myThread.start();
        MyThread myThread1=new MyThread();
        myThread1.start();


        //multiple task from multiple thread
        Mythread1 mythreads1=new Mythread1();
        mythreads1.start();
        Mythread2 mythread2=new Mythread2();
        mythread2.start();
    }
}
