package 设计模式.单例模式;

/**
 * @author chenh
 * @date 2019-08-15
 */
public class 懒汉上锁版 {

    private static 懒汉上锁版 instance;

    /**
     * 可以锁定方法，但是有点多。锁住new 即可。
     * 多线程下，完全ok 不会出现奇怪问题。
     *
     * @return
     */
    public static 懒汉上锁版 newInstance() {
        if (instance == null) {
            synchronized (懒汉上锁版.class) {
                if (instance == null) {
                    instance = new 懒汉上锁版();
                }
            }
        }
        return instance;
    }

    public void eat() {
        System.out.println("懒汉上锁版！");
    }

    public static void main(String[] args) {
        懒汉上锁版.newInstance().eat();
    }


}
