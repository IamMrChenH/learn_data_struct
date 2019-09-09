import 注解.一个简单注解.Main;

/**
 * @author IamMr
 * @date 2019年07月05日 —— 22:22
 */
public class 递归斐波那契 {


    public static void main(String[] args) {
//        System.out.println(new 递归斐波那契().fun(11));
        new 递归斐波那契().fun2(10);
    }

    public int fun(int i) {
        return (i == 0 || i == 1) ? i : fun(i - 1) + fun(i - 2);
    }

    public int fun2(int size) {
        int f1 = 1, f2 = 1, fx = 0;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        for (int i = 0; i < size - 2; i++) {
            fx = f1 + f2;
            f1 = f2;
            f2 = fx;
            System.out.print(fx + " ");
        }
        return fx;
    }

}
