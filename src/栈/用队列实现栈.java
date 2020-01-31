package 栈;

import java.util.LinkedList;
import java.util.Queue;

public class 用队列实现栈 {
    Queue<Integer> mQueue1;

    /**
     * Initialize your data structure here.
     */
    public 用队列实现栈() {
        mQueue1 = new LinkedList<>();//队列
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        mQueue1.add(x);
        int size = mQueue1.size();
        while (size > 1) {
            mQueue1.add(mQueue1.poll());
            size--;
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return mQueue1.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return mQueue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return mQueue1.isEmpty();
    }

}
