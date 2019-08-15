package 设计模式.单例模式;

/**
 * @author chenh
 * @date 2019-08-15
 * 静态代码块中的代码 会自动的在最早的时刻执行，但只执行一次。
 */
public class 最终饿汉版 {
    private static 最终饿汉版 instance;

    static {
        instance = new 最终饿汉版();
    }

    public static 最终饿汉版 newInstance() {
        return instance;
    }

    public void eat() {
        System.out.println("最终饿汉版！");
    }

    public static void main(String[] args) {
        最终饿汉版.newInstance().eat();
    }

}
