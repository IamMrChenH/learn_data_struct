package 线程;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程顺序执行_ {


    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 3, 0L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        executor.execute(线程顺序执行_join变单线程了.T1);
        executor.execute(线程顺序执行_join变单线程了.T2);
        executor.execute(线程顺序执行_join变单线程了.T3);
        executor.shutdown();
    }
}
