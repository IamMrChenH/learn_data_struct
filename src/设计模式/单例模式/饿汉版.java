package 设计模式.单例模式;

/**
 * @author chenh
 * @date 2019-08-15
 */
public class 饿汉版 {

    private static 饿汉版 instance = new 饿汉版();

    public static 饿汉版 newInstance() {
        return instance;
    }

    public void eat() {
        System.out.println("饿汉版！");
    }

    public static void main(String[] args) {
        饿汉版.newInstance().eat();
    }

}
