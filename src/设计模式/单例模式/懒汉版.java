package 设计模式.单例模式;

/**
 * @author chenh
 * @date 2019-08-15
 * <p>
 * 在需要的时间，才会创建。但是在遇到多线程的情况下 可能会重复创建多个。
 */
public class 懒汉版 {

    private static 懒汉版 instance;

    public static 懒汉版 newInstance() {
        if (instance == null) {
            instance = new 懒汉版();
        }
        return instance;
    }

    public void eat() {
        System.out.println("懒汉版！");
    }

    public static void main(String[] args) {
        懒汉版.newInstance().eat();
    }


}
