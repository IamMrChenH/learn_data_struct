import java.util.Stack;

public class 每日温度 {


    public int[] F(int[] D) {
        int[] A = new int[D.length];

        Stack<Integer> integers = new Stack<>();

        for (int i = 0; i < D.length; i++) {

            while (!integers.isEmpty() && D[integers.peek()] < D[i]) {
                Integer pop = integers.pop();
                A[pop] = i - pop;
            }

            integers.push(i);
        }


        return A;
    }

}