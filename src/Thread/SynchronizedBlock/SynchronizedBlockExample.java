package Thread.SynchronizedBlock;

public class SynchronizedBlockExample {

    private int count;
    private Object lock=new Object();
    public void increment(){
        synchronized (lock){
            count++;
        }
    }
    public void decrement(){
        synchronized (lock){
            count--;
        }
    }
    private int getCount(){
        return count;
    }

    public static void main(String[] args) {
        SynchronizedBlockExample example=new SynchronizedBlockExample();
        Thread incrementThread=new Thread(()->{
            for (int i=0;i<100;i++){
                example.increment();
            }

        });
        Thread incrementThread2=new Thread(()->{
            for (int i=0;i<100;i++){
                example.decrement();
            }

        });
        incrementThread.start();
        incrementThread2.start();
        try{
            incrementThread.join();
            incrementThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count"+example.getCount());
    }

}
