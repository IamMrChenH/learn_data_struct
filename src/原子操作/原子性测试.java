package 原子操作;

import java.util.concurrent.atomic.AtomicInteger;

public class 原子性测试 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.incrementAndGet();

        System.out.println(atomicInteger);

    }
}
