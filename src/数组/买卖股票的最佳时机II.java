package 数组;

/**
 * @author chenh
 * @date 2019-10-17
 */
public class 买卖股票的最佳时机II {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int j = 0, retult = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > prices[j]) {
                //卖出
                retult += prices[i] - prices[j];
                j = i;
            } else if (prices[i] < prices[j]) {
                //买入
                j = i;
            }
        }
        return retult;
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        k = k % (nums.length);
        System.out.println(k);
        int end1 = nums.length - 1;
        int end2 = end1 - k;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i <= end2) {
                nums[end1] = nums[i];
                end1--;
            } else {
                
            }

        }
    }

    public static void sowp(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        rotate(ints, 2);
        System.out.println();
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
