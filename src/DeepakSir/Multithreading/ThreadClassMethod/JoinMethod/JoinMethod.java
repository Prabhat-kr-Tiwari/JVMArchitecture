package DeepakSir.Multithreading.ThreadClassMethod.JoinMethod;

public class JoinMethod extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(currentThread().getName()+"     "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod joinMethod=new JoinMethod();
        joinMethod.start();
        joinMethod.join();
        for (int i = 0; i <5 ; i++) {
            System.out.println(currentThread().getName()+"     "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
