import 注解.一个简单注解.Main;

/**
 * @author IamMr
 * @date 2019年07月05日 —— 22:22
 */
public class 递归斐波那契 {


    public static void main(String[] args) {
        System.out.println(new 递归斐波那契().fun(11));
    }

    public int fun(int i) {
        return (i == 0 || i == 1) ? i : fun(i - 1) + fun(i - 2);
    }

}
