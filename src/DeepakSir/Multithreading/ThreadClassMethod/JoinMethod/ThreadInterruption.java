package DeepakSir.Multithreading.ThreadClassMethod.JoinMethod;
public class ThreadInterruption extends Thread {
    @Override
    public void run() {
        System.out.println("A1  " + Thread.interrupted()); //true ->false
        System.out.println("A1  " + Thread.interrupted());  //false
//       System.out.println("B1  " + Thread.currentThread().isInterrupted()); //true -> true
//        System.out.println("B1  " + Thread.currentThread().isInterrupted()); //true -> true
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
//                System.out.println("Inside "+Thread.interrupted());
//                System.out.println("Inside 1 "+Thread.interrupted());
//                System.out.println("B1 Inside  " + Thread.currentThread().isInterrupted());
            }

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        ThreadInterruption threadInterruption = new ThreadInterruption();
        threadInterruption.start();
        threadInterruption.interrupt();


    }
}
