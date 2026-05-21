package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

class Solution189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }
        if (k % nums.length == 0) {
            return;
        }
        k = k % nums.length;
        int n = nums.length;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
