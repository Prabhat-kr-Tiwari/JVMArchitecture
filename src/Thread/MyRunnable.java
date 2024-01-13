package Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
        }

    }

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);
        thread.start();
        //thread2.start();

    }
}
