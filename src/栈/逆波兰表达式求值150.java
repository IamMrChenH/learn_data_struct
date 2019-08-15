package 栈;

import java.util.Stack;

class 逆波兰表达式求值150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            eval(stack, token);
        }
        return stack.pop();
    }

    private void eval(Stack<Integer> stack, String token) {
        if (token.equals("+")) {
            Integer p2 = stack.pop();
            Integer p1 = stack.pop();
            stack.push(p1 + p2);
        } else if (token.equals("-")) {
            Integer p2 = stack.pop();
            Integer p1 = stack.pop();
            stack.push(p1 - p2);
        } else if (token.equals("*")) {
            Integer p2 = stack.pop();
            Integer p1 = stack.pop();
            stack.push(p1 * p2);
        } else if (token.equals("/")) {
            Integer p2 = stack.pop();
            Integer p1 = stack.pop();
            stack.push(p1 / p2);
        } else {
            stack.push(Integer.parseInt(token));
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"};
        System.out.println(new 逆波兰表达式求值150().evalRPN(tokens));
    }

}