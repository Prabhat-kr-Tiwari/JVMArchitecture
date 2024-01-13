package DeepakSir.Multithreading.ThreadClassMethod;

public class ThreadName   extends Thread {

    @Override
    public void run() {
        System.out.println("thread task is executed by   "+currentThread().getName());
    }

    public static void main(String[] args) {
        //System.out.println("Hello");
        //getting the main thread name
        System.out.println("Thread Name  "+Thread.currentThread().getName());
        //setting the main thread name
        Thread.currentThread().setName("Prabhat");
        System.out.println("Thread Name  "+Thread.currentThread().getName());
//        System.out.println(10/0);
        System.out.println("Thread Name   "+Thread.currentThread().getName());


        //
        ThreadName  threadName=new ThreadName();
        threadName.setName("Xcelore");
        threadName.start();

        ThreadName  threadName1=new ThreadName();
        threadName1.setName("qwerty");
        threadName1.start();
        System.out.println("Thread1 is alive   "+threadName1.isAlive());
        System.out.println();
    }
}
