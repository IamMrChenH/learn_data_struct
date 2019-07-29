package 栈;

import java.util.Stack;

/**
 * @author chenh
 * @date 2019-07-29
 */
public class 删除最外层的括号 {
    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0, end;
        boolean base = false;
        for (int i = 0; i < S.length(); i++) {
            char index = S.charAt(i);
            if (index == '(') {
                stack.push(index);
                if (!base) {
                    start = i;
                    base = true;
                }
            }

            if (index == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    base = false;
                    builder.append(S.substring(start + 1, end));
                }

            }

        }
        return builder.toString();

    }
}
