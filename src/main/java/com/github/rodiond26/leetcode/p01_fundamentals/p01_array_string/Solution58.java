package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

import java.util.*;

class Solution58 {
    public   int lengthOfLastWord(String s) {
        int last = s.length() - 1;
        while (last >= 0 && !Character.isLetterOrDigit(s.charAt(last))) {
            last--;
        }
        int first = last;
        while (first >= 0 && Character.isLetterOrDigit(s.charAt(first))){
            first--;
        }
        return last - first + 1;
    }
}
