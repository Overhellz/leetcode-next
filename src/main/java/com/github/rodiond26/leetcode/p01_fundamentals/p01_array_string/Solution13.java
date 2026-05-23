package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

import java.util.Map;

class Solution13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
