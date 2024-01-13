package DeepakSir.Multithreading.ThreadClassMethod.YieldMethod;

public class YieldMethod extends Thread{
    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }
    public static void main(String[] args) {
        YieldMethod yieldMethod=new YieldMethod();
        yieldMethod.start();
//        Thread.yield(); If you want main thread to stop and provide  chance to other thread for execution
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"   "+i);

        }
    }
}
