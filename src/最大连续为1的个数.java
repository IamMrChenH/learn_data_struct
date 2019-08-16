/**
 * @author chenh
 * @date 2019-08-16
 */
public class 最大连续为1的个数 {
    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder builder = new StringBuilder();
        for (int num : nums) {
            builder.append(num);
        }
        String[] split = builder.toString().split("0");

        int max = 0;
        for (String s : split) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int maxConsecutiveOnes = new 最大连续为1的个数().findMaxConsecutiveOnes(new int[]{1, 1, 0,0, 1, 1, 1});
        System.out.println(maxConsecutiveOnes);
    }
}
