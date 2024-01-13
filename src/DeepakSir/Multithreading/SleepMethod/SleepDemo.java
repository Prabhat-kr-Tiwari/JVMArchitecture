package DeepakSir.Multithreading.SleepMethod;

public class SleepDemo extends Thread {
    @Override
    public void run() {
        try {
            //here we cannot pass negative value
           // Thread.sleep(1000,-213);
            //this sleep the thread 0
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <5 ; i++) {
            //this will sleeping the main thread
            Thread.sleep(1000);
            System.out.println(i);

        }
    }
}
