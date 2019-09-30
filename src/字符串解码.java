import java.util.Stack;

public class 字符串解码 {
    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> indexs = new Stack<>();
        StringBuilder res = new StringBuilder();
        Integer multi = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                indexs.push(multi);
                stack.push(res.toString());
                res = new StringBuilder();
                multi = 0;
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                Integer pop = indexs.pop();
                for (Integer i = 0; i < pop; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stack.pop() + tmp);
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.valueOf(c + "");

            } else {
                res.append(c);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }
}
