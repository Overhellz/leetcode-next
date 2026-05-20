package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

class Solution122 {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[i - 1];
            if (currentProfit > 0) {
                profit += currentProfit;
            }
        }
        return profit;
    }
}
