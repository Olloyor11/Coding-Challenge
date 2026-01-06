package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[]nums, int target) {
        Map<Integer, Integer> solution = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];

            if (solution.containsKey(compliment)) {
                return new int[]{solution.get(compliment), i};
            }
            solution.put(nums[i], i);
        }
        return new int[] {};


    }
}

