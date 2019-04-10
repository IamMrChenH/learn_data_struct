package 线程;

public class 线程顺序执行_join变单线程了 {
    public static Thread T1 = new Thread(() -> {
        System.out.println(Thread.currentThread().getName() + " -- 1");
    }, "Thread-1");
    public static Thread T2 = new Thread(() -> {
        System.out.println(Thread.currentThread().getName()+ " -- 2");
    }, "Thread-2");

    public static Thread T3 = new Thread(() -> {
        System.out.println(Thread.currentThread().getName()+ " -- 3");
    }, "Thread-3");

    public static void main(String[] args) throws InterruptedException {


        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
        T3.join();


    }
}
