public class 数字倒序 {
    public static int re(int x) {
        long sum = 0;
        for (; x != 0; x /= 10) {
            sum = sum * 10 + x % 10;
        }
        return sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE ? 0 : (int) sum;
    }

    public static void main(String[] a) {
        re(-123);
    }
}
