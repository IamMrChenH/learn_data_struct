package 栈;

import java.util.Stack;

/**
 * @author CHENH
 * @version 1.0
 * @date 2020/02/02
 */
public class 括号的分数_856 {

    public static int scoreOfParentheses(String S) {
        char[] array = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                stack.push(array[i]);
            } else {
                //弹出
                if (stack.peek() == '(') {
                    //放入
                    stack.pop();
                    stack.push((char) 1);
                } else {
                    char c = stack.pop();
                    int temp = 0;
                    while (c != '(') {
                        temp += c;
                        c = stack.pop();
                    }
                    stack.push((char) (2 * temp));
                }
            }
        }
        int result = 0;
        for (Character character : stack) {
            result += character;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("()()"));
    }
}
