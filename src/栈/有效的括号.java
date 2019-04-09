package 栈;

import java.util.Stack;

public class 有效的括号 {
    public static boolean isValid(String s) {
        if (s.equals("")) return true;
        if (s.length() == 0 || s.length() == 1) return false;
        Stack<Character> mStrings = new Stack<>();
        for (char charAt : s.toCharArray()) {
            if (charAt == '(')
                mStrings.add(charAt);
            else if (charAt == '[')
                mStrings.add(charAt);
            else if (charAt == '{')
                mStrings.add(charAt);

            if (!mStrings.isEmpty()) {
                if (charAt == ')' && mStrings.peek() == '(') {
                    mStrings.pop();
                } else if (charAt == ']' && mStrings.peek() == '[') {
                    mStrings.pop();
                } else if (charAt == '}' && mStrings.peek() == '{') {
                    mStrings.pop();
                } else {
                    if (charAt == ')' || charAt == ']' || charAt == '}')
                        return false;
                }
            } else {
                if (charAt == ')' || charAt == ']' || charAt == '}')
                    return false;
            }
        }
        return mStrings.isEmpty();
    }

    public static void main(String[] a) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
