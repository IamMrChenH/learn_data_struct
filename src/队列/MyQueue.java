package 队列;

import java.util.Stack;

/**
 * 用栈实现队列
 */

public class MyQueue {
    Stack<Integer> s1 = null;
    Stack<Integer> s2 = null;

    public MyQueue() {
        //正常
        s1 = new Stack<>();
        //倒叙
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s2.empty())
            s1.push(s2.pop());
        s1.push(x);
    }


    public int pop() {
        while (!s1.empty())
            s2.push(s1.pop());
        return s2.pop();
    }


    public int peek() {
        while (!s1.empty())
            s2.push(s1.pop());
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
