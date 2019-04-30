package 队列;

public class 字符串倒序 {
    public static void main(String[] args) {

        System.out.println(reverse("123".toCharArray()));
    }

    private static char[] reverse(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
        return s;
    }
}
