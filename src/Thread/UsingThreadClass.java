package Thread;

public class UsingThreadClass extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Thread: "+Thread.currentThread().getName()+"  Count "+i);

        }
    }

    public static void main(String[] args) {
        UsingThreadClass usingThreadClass=new UsingThreadClass();
        usingThreadClass.start();
    }
}
