public class 数字倒序 {
    public static int re(int x) {
        int sum = 0;
        for (; x != 0; x /= 10) {
            sum = sum * 10 + x % 10;
            System.out.println(sum);
        }
        return 0;
    }

    public static void main(String[] a) {
        re(-123);

    }
}
