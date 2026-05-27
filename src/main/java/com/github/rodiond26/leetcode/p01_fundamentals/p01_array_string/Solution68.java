package com.github.rodiond26.leetcode.p01_fundamentals.p01_array_string;

import java.util.ArrayList;
import java.util.List;

class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;

        while (i < n) {

            int j = i;
            int lineLength = words[j].length();
            j++;

            while (j < n && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            int wordCount = j - i;

            int totalChars = 0;
            for (int k = i; k < j; k++) {
                totalChars += words[k].length();
            }
            int totalSpaces = maxWidth - totalChars;
            StringBuilder line = new StringBuilder();

            if (j == n || wordCount == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } else {
                int spaces = totalSpaces / (wordCount - 1);
                int extra = totalSpaces % (wordCount - 1);

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                         for (int s = 0; s < spaces; s++) {
                             line.append(" ");
                         }
                        if (extra > 0) {
                            line.append(" ");
                            extra--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
