import java.util.Stack;

public class 棒球比赛 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String data[] = {"5", "2", "C", "D", "+","+"};

        int sum = calPoints(data);
        System.out.println(sum);

    }

    public static int calPoints(String[] ops) {
        Stack<Integer> mStack = new Stack<>();
        for (String msg : ops) {
            if (msg.equals("+")) {
                int top = mStack.pop();
                int newTop = mStack.peek() + top;
                mStack.push(top);
                mStack.push(newTop);

            } else if (msg.equals("C")) {
                mStack.pop();
            } else if (msg.equals("D")) {
                mStack.push(mStack.peek() * 2);

            } else {
                mStack.push(Integer.valueOf(msg));
            }


        }
        int sum = 0;
        for (Integer i : mStack) {
            sum += i;
        }

        return sum;
    }
}
