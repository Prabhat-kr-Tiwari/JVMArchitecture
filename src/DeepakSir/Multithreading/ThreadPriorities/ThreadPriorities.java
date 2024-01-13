package DeepakSir.Multithreading.ThreadPriorities;

public class ThreadPriorities extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorities threadPriorities=new ThreadPriorities();
        threadPriorities.start();
        System.out.println("old  "+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
        threadPriorities.setPriority(10);
        System.out.println("name "+threadPriorities.getName());
//        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
    }
}
