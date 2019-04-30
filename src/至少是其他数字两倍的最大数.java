public class 至少是其他数字两倍的最大数 {

    public static int dominantIndex(int[] nums) {
        int max = -9999, position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                position = i;
            }
        }
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == position) continue;
            int d = nums[i] * 2;
            if (d <= max) continue;
            flag--;
        }

        return flag != 0 ? -1 : position;
    }


    public static void main(String[] args) {
        int[] a = {0, 1, 2, 4};
        System.out.println(dominantIndex(a));
    }

}
