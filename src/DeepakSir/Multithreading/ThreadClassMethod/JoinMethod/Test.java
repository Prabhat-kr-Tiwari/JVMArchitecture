package DeepakSir.Multithreading.ThreadClassMethod.JoinMethod;

public class Test extends Thread{


    static Thread thread;

    @Override
    public void run() {


        for (int i = 0; i < 5; i++) {

            try {
                thread.join();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread   "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test test=new Test();
        test.start();

        thread=Thread.currentThread();

        for (int i = 0; i < 5; i++) {


            Thread.sleep(1000);
            System.out.println("Main Thread "+i);

        }

    }
}
