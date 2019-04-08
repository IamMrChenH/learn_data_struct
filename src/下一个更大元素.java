import java.util.HashMap;
import java.util.Stack;

public class 下一个更大元素 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};

        nextGreaterElement(nums1, nums2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> book = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int relust[] = new int[nums1.length];
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                book.put(stack.pop(), num);

            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            relust[i] = book.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
