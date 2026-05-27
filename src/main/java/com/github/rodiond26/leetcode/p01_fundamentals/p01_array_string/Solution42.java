package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

class Solution42 {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int[] maxLeft = new int[height.length];
        maxLeft[0] = 0;
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        }

        int[] maxRight = new int[height.length];
        maxRight[maxRight.length - 1] = 0;
        for (int i = maxRight.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }

        int sum = 0;
        int[] min = new int[height.length];
        for (int i = 0; i < min.length; i++) {
            min[i] = Math.min(maxLeft[i], maxRight[i]);
            int water = min[i] - height[i];
            if (water > 0) {
                sum += water;
            }
        }
        return sum;
    }
}
