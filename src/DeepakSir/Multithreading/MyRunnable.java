package DeepakSir.Multithreading;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("My runnable task");
    }

    public static void main(String[] args) {
      MyRunnable myRunnable=new MyRunnable();
      Thread thread=new Thread(myRunnable);
      thread.start();

    }
}
