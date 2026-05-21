package com.github.rodiond26.leetcode.p01_fundamentals.p02_two_pointers;

class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int len = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, len * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
