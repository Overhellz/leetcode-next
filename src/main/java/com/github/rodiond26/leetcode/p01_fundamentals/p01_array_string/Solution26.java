package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
