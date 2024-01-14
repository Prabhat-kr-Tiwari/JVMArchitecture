package DeepakSir.Multithreading.SleepDemo2;

public class Test extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {

            System.out.println(i+"  "+currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
         /*
        Test test = new Test();
        test.run();
        Test test1 = new Test();
        test1.run();

at first one function will be called and then other
0  main
1  main
2  main
3  main
4  main
0  main
1  main
2  main
3  main
4  main
        */
        Test test=new Test();
        test.start();
        Test test1=new Test();
        test1.start();
        /*
        0  Thread-0
0  Thread-1
1  Thread-0
1  Thread-1
2  Thread-1
2  Thread-0
3  Thread-1
3  Thread-0
4  Thread-1
4  Thread-0

        */
    }
}
