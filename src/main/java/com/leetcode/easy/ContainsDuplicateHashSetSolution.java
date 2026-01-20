package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateHashSetSolution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num))
                return true;

            hashSet.add(num);
        }

        return false;

    }
}
