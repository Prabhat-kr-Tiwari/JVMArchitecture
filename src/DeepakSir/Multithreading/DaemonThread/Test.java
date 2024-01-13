package DeepakSir.Multithreading.DaemonThread;

public class Test extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){

            System.out.println("Daemon Thread");
        }else{
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
//        System.out.println("Main Thread");
        Test t=new Test();
        t.setDaemon(true);
        t.start();

    }
}
