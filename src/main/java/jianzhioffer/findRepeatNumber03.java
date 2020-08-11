package main.java.jianzhioffer;

import java.util.HashSet;

public class findRepeatNumber03 {
    public int findRepeatNumber(int[] nums) {
        int t;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                t = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = t;
            }
        }
        return -1;

    }
}
