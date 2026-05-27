package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
