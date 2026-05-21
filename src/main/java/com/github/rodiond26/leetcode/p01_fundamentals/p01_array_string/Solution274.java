package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

import java.util.Arrays;

class Solution274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
