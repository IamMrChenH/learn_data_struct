package 栈;

import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> mArrayList;
    int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mArrayList = new ArrayList<>();
    }

    public void push(int x) {
        mArrayList.add(x);
        if (min > x)
            min = x;
    }

    public void pop() {
        if (!mArrayList.isEmpty()) {
            int top = top();
            mArrayList.remove(mArrayList.size() - 1);
            if (top == min) {
                int t = 99999;
                for (Integer sum : mArrayList) {
                    t = Math.min(t, sum);
                }
                min = t;
            }
        }
    }

    public int top() {
        if (mArrayList.isEmpty()) return -1;
        return mArrayList.get(mArrayList.size() - 1);
    }

    public int getMin() {
        if (mArrayList.isEmpty()) return -1;

        return min;
    }

    public static void main(String[] a) {

        // MinStack object will be instantiated and called as such:
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
    }
}

