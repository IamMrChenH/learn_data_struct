public class 寻找数组的中心索引 {
    public int pivotIndex(int[] nums) {
        for (int mid = 0; mid < nums.length; mid++) {
            int i = 0, j = mid + 1;
            int sumLeft = 0, sumRight = 0;
            for (; i < mid; i++) sumLeft = sumLeft + nums[i];
            for (; j < nums.length; j++) sumRight = sumRight + nums[j];
            if (sumLeft == sumRight) return mid;
        }
        return -1;
    }
}
