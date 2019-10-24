package 数组;

/**
 * @author chenh
 * @date 2019-10-24
 */
public class 旋转数组 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 0 || k == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
