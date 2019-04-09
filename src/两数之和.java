import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] data = new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                if ((nums[i] + nums[j]) == target) {
                    data[0] = i;
                    data[1] = j;
                    return data;
                }
            }
        }
        return data;
    }

    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comm = target - nums[i];
            if (map.containsKey(comm)) {
                return new int[]{map.get(comm), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
