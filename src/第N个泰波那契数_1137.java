/**
 * @author CHENH
 * @version 1.0
 * @date 2020/01/31
 */
public class 第N个泰波那契数_1137 {

    public static int tribonacci1(int n) {
        if (n == 1 || n == 2) return 1;
        if (n < 1) return 0;
        int[] num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }
        return num[n];
    }

    public static int tribonacci2(int n) {
        int t0 = 0, t1 = 1, t2 = 1;
        while (n-- > 0) {
            t2 = t0 + t1 + t2;
            t1 = t2 - t0 - t1;
            t0 = t2 - t0 - t1;
        }
        /**
         * f(n) = f(n-3)+f(n-2)+f(n-1)
         *  t0+t1+t2 = t3
         *  t3-t0-t1 = t2
         *  t3-t0-t2 = t1
         *  t3-t1-t2 = t0
         */
        return t0;
    }

    public static int tribonacci(int n) {
        if (n == 1 || n == 2) return 1;
        if (n < 1) return 0;
        int[] num = {0, 1, 1, 0};
        for (; n > 0 && n > 2; n--) {
            num[3] = num[0] + num[1] + num[2];
            num[1] = num[3] - num[0] - num[1];
            num[0] = num[3] - num[0] - num[2];
            num[2] = num[3];
        }
        return num[3];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

}
