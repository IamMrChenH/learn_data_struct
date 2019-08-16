package 数组;

/**
 * @author chenh
 * @date 2019-08-15
 */
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int tail = nums.length ;
        while (index < tail) {
            if (nums[index] == val) {
                nums[index] = nums[tail-1];
            } else {
                index++;
            }
        }
        return tail;
    }


    public static void main(String[] args) {
        new 移除元素().removeElement(new int[]{3, 2, 2, 3}, 3);

    }
}
