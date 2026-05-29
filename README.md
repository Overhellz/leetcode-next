# leetcode-next

https://github.com/Overhellz/leetcode-next

---

# Leetcode Badges

## Top Interview 150

https://leetcode.com/studyplan/top-interview-150/

## Top 100 Liked

https://leetcode.com/studyplan/top-100-liked/

## LeetCode 75

https://leetcode.com/studyplan/leetcode-75/

---

| Retention | Description                                                         |
|:---------:|:--------------------------------------------------------------------|
|     5     | Решено самостоятельно, в пределах времени.                          |
|     4     | Решено самостоятельно, но слишком медленно / незначительные ошибки. |
|     3     | Вспомнил алгоритм, но в коде были ошибки / нужны были подсказки.    |
|     2     | Смутно помнил тему, не смог решить.                                 |
|     1     | Полный провал (не распознал задачу).                                |

---

### 1. Fundamentals

1. Array / String
2. Two Pointers
3. Sliding Window
4. Hash Map
5. Stack, Queue
6. Prefix Sum
7. Binary Search
8. Intervals

### 2. Linked Lists & Trees

1. Linked List
2. Binary Tree DFS
3. Binary Tree BFS
4. Binary Search Tree BST
5. Trie
6. Heap / Priority Queue

### 3. Graphs

1. Graph General
2. Graph DFS
3. Graph BFS
4. Topological Sort
5. Dijkstra's Algorithm (Shortest Path)
6. Union-Find (Disjoint Set)

### 4. Recursion & Combinatorics

1. Recursion basics
2. Backtracking
    - Subsets
    - Combinations
    - Permutations
    - Subsets with duplicates
    - Combination sum
    - Palindrome partitioning
    - N-Queens
3. Divide & Conquer
    - Merge sort
    - Quick select (Kth largest)

### 5. Dynamic Programming

1. DP — Memoization vs Tabulation
2. DP — 1D
    - Climbing stairs
    - House robber
    - Decode ways
    - Word break
3. DP — 2D
    - Unique paths
    - Longest common subsequence
    - Edit distance
    - Coin change II
4. DP — Interval / Matrix
    - Palindrome substrings
    - Burst balloons (optional)
5. DP — State machine
    - Best time to buy/sell stock (with cooldown, transaction limits)

### 6. Advanced / Complementary

1. Greedy Algorithms
    - Interval scheduling
    - Jump game
    - Gas station
2. Bit Manipulation
    - XOR tricks
    - Bit masking for subsets
3. Monotonic Stack
    - Next greater element
    - Largest rectangle in histogram
4. Design / OOP
    - LRU Cache (if asked)
    - Min stack
    - Randomized set

---

# 1 Fundamentals

## 1.1 Array / String

| Level  | Name                                                   | Link                                                                              | Retention |
|:------:|:-------------------------------------------------------|:----------------------------------------------------------------------------------|:----------|
|  Easy  | 88. Merge Sorted Array                                 | https://leetcode.com/problems/merge-sorted-array/                                 | 5         |
|  Easy  | 27. Remove Element                                     | https://leetcode.com/problems/remove-element/                                     | 5         |
|  Easy  | 26. Remove Duplicates from Sorted Array                | https://leetcode.com/problems/remove-duplicates-from-sorted-array/                | 5         |
| Medium | 80. Remove Duplicates from Sorted Array II             | https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/             | 3         |
|  Easy  | 169. Majority Element                                  | https://leetcode.com/problems/majority-element/                                   | 4         |
| Medium | 189. Rotate Array                                      | https://leetcode.com/problems/rotate-array/                                       | 3         |
|  Easy  | 121. Best Time to Buy and Sell Stock                   | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/                    | 5         |
| Medium | 122. Best Time to Buy and Sell Stock II                | https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/                 | 3         |
| Medium | 55. Jump Game                                          | https://leetcode.com/problems/jump-game/                                          | 3         |
| Medium | 45. Jump Game II                                       | https://leetcode.com/problems/jump-game-ii/                                       | 2         |
| Medium | 274. H-Index                                           | https://leetcode.com/problems/h-index/                                            | 2         |
| Medium | 380. Insert Delete GetRandom O(1)                      | https://leetcode.com/problems/insert-delete-getrandom-o1/                         | 2         |
| Medium | 238. Product of Array Except Self                      | https://leetcode.com/problems/product-of-array-except-self/                       | 3         |
| Medium | 134. Gas Station                                       | https://leetcode.com/problems/gas-station/                                        | 2         |
|  Hard  | 135. Candy                                             | https://leetcode.com/problems/candy/                                              | 2         |
|  Hard  | 42. Trapping Rain Water                                | https://leetcode.com/problems/trapping-rain-water/                                | 2         |
| Medium | 13. Roman to Integer                                   | https://leetcode.com/problems/roman-to-integer/                                   | 2         |
| Medium | 12. Integer to Roman                                   | https://leetcode.com/problems/integer-to-roman/                                   | 2         |
|  Easy  | 58. Length of Last Word                                | https://leetcode.com/problems/length-of-last-word/                                | 4         |
|  Easy  | 14. Longest Common Prefix                              | https://leetcode.com/problems/longest-common-prefix/                              | 2         |
| Medium | 151. Reverse Words in a String                         | https://leetcode.com/problems/reverse-words-in-a-string/                          | 2         |
| Medium | 6. Zigzag Conversion                                   | https://leetcode.com/problems/zigzag-conversion/                                  | 2         |
|  Easy  | 28. Find the Index of the First Occurrence in a String | https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/ | 2         |
|  Hard  | 68. Text Justification                                 | https://leetcode.com/problems/text-justification/                                 | 1         |
|  Easy  | 1768. Merge Strings Alternately                        | https://leetcode.com/problems/merge-strings-alternately/                          |           |
|  Easy  | 1071. Greatest Common Divisor of Strings               | https://leetcode.com/problems/greatest-common-divisor-of-strings/                 |           |
|  Easy  | 1431. Kids With the Greatest Number of Candies         | https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/           |           |
|  Easy  | 605. Can Place Flowers                                 | https://leetcode.com/problems/can-place-flowers/                                  |           |
|  Easy  | 345. Reverse Vowels of a String                        | https://leetcode.com/problems/reverse-vowels-of-a-string/                         |           |
| Medium | 334. Increasing Triplet Subsequence                    | https://leetcode.com/problems/increasing-triplet-subsequence/                     |           |
| Medium | 443. String Compression                                | https://leetcode.com/problems/string-compression/                                 |           |

## 1.2 Two Pointers

| Level  | Name                                    | Link                                                            | Retention |
|:------:|:----------------------------------------|:----------------------------------------------------------------|:----------|
|  Easy  | 125. Valid Palindrome                   | https://leetcode.com/problems/valid-palindrome/                 | 5         |
|  Easy  | 392. Is Subsequence                     | https://leetcode.com/problems/is-subsequence/                   | 5         |
| Medium | 167. Two Sum II - Input Array Is Sorted | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ | 5         |
| Medium | 11. Container With Most Water           | https://leetcode.com/problems/container-with-most-water/        | 5         |
| Medium | 15. 3Sum                                | https://leetcode.com/problems/3sum/                             |           |
|  Easy  | 283. Move Zeroes                        | https://leetcode.com/problems/move-zeroes/                      |           |
| Medium | 1679. Max Number of K-Sum Pairs         | https://leetcode.com/problems/max-number-of-k-sum-pairs/        |           |
|  Easy  | 344. Reverse String                     | https://leetcode.com/problems/reverse-string/                   |           |
|  Easy  | 977. Squares of a Sorted Array          | https://leetcode.com/problems/squares-of-a-sorted-array/        |           |
|  Easy  | 844. Backspace String Compare           | https://leetcode.com/problems/backspace-string-compare/         |           |
| Medium | 18. 4Sum                                | https://leetcode.com/problems/4sum/                             |           |

## 1.3 Sliding Window

| Level  | Name                                                          | Link                                                                                   | Retention |
|:------:|:--------------------------------------------------------------|:---------------------------------------------------------------------------------------|:----------|
| Medium | 209. Minimum Size Subarray Sum                                | https://leetcode.com/problems/minimum-size-subarray-sum/                               |           |
| Medium | 3. Longest Substring Without Repeating Characters             | https://leetcode.com/problems/longest-substring-without-repeating-characters/          |           |
|  Hard  | 30. Substring with Concatenation of All Words                 | https://leetcode.com/problems/substring-with-concatenation-of-all-words/               |           |
|  Hard  | 76. Minimum Window Substring                                  | https://leetcode.com/problems/minimum-window-substring/                                |           |
|  Easy  | 643. Maximum Average Subarray I                               | https://leetcode.com/problems/maximum-average-subarray-i/                              |           |            
| Medium | 1004. Max Consecutive Ones III                                | https://leetcode.com/problems/max-consecutive-ones-iii/                                |           |
| Medium | 1493. Longest Subarray of 1's After Deleting One Element      | https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/       |           |
| Medium | 904. Fruit Into Baskets                                       | https://leetcode.com/problems/fruit-into-baskets/                                      |           |
| Medium | 424. Longest Repeating Character Replacement                  | https://leetcode.com/problems/longest-repeating-character-replacement/                 |           |
| Medium | 567. Permutation in String                                    | https://leetcode.com/problems/permutation-in-string/                                   |           |
| Medium | 438. Find All Anagrams in a String                            | https://leetcode.com/problems/find-all-anagrams-in-a-string/                           |           |
|  Hard  | 239. Sliding Window Maximum                                   | https://leetcode.com/problems/sliding-window-maximum/                                  |           |
| Medium | 1456. Maximum Number of Vowels in a Substring of Given Length | https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/ |           |

## 1.4 Hash Map

| Level  | Name                              | Link                                                        | Retention |
|:------:|:----------------------------------|:------------------------------------------------------------|:----------|
|  Easy  | 706. Design HashMap               | https://leetcode.com/problems/design-hashmap/               |           |     
|  Easy  | 1. Two Sum                        | https://leetcode.com/problems/two-sum/                      |           |
|  Easy  | 136. Single Number                | https://leetcode.com/problems/single-number/                |           |
| Medium | 49. Group Anagrams                | https://leetcode.com/problems/group-anagrams/               |           |
| Medium | 128. Longest Consecutive Sequence | https://leetcode.com/problems/longest-consecutive-sequence/ |           |
| Medium | 454. 4Sum II                      | https://leetcode.com/problems/4sum-ii/                      |           |

## 1.5 Stack, Queue

| Level  | Name                                           | Link                                                                    | Repeatable |
|:------:|:-----------------------------------------------|:------------------------------------------------------------------------|:----------:|
|  Easy  | 20. Valid Parentheses                          | https://leetcode.com/problems/valid-parentheses/                        |            |
|  Easy  | 1047. Remove All Adjacent Duplicates In String | https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/ |            |
| Medium | 2390. Removing Stars From a String             | https://leetcode.com/problems/removing-stars-from-a-string/             |            |
| Medium | 71. Simplify Path                              | https://leetcode.com/problems/simplify-path/                            |            |
|  Easy  | 933. Number of Recent Calls                    | https://leetcode.com/problems/number-of-recent-calls/                   |            |
|  Easy  | 20. Valid Parentheses                          | https://leetcode.com/problems/valid-parentheses/                        |            |
|  Easy  | 1047. Remove All Adjacent Duplicates In String | https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/ |            |
| Medium | 2390. Removing Stars From a String             | https://leetcode.com/problems/removing-stars-from-a-string/             |            |
|  Easy  | 232. Implement Queue using Stacks              | https://leetcode.com/problems/implement-queue-using-stacks/             |            |
|  Easy  | 225. Implement Stack using Queues              | https://leetcode.com/problems/implement-stack-using-queues/             |            |
| Medium | 155. Min Stack                                 | https://leetcode.com/problems/min-stack/                                |            |
|  Easy  | 933. Number of Recent Calls                    | https://leetcode.com/problems/number-of-recent-calls/                   |            |
| Medium | 71. Simplify Path                              | https://leetcode.com/problems/simplify-path/                            |            |
| Medium | 150. Evaluate Reverse Polish Notation          | https://leetcode.com/problems/evaluate-reverse-polish-notation/         |            |

## 1.6 Prefix Sum

| Level  | Name                              | Link                                                        | Retention |
|:------:|:----------------------------------|:------------------------------------------------------------|:----------|
|  Easy  | 303. Range Sum Query - Immutable  | https://leetcode.com/problems/range-sum-query-immutable/    |           |
|  Easy  | 724. Find Pivot Index             | https://leetcode.com/problems/find-pivot-index/             |           |
| Medium | 560. Subarray Sum Equals K        | https://leetcode.com/problems/subarray-sum-equals-k/        |           |
| Medium | 525. Contiguous Array             | https://leetcode.com/problems/contiguous-array/             |           |
| Medium | 974. Subarray Sums Divisible by K | https://leetcode.com/problems/subarray-sums-divisible-by-k/ |           |

## 1.7 Binary Search

| Level  | Name                                                        | Link                                                                                   | Retention |
|:------:|:------------------------------------------------------------|:---------------------------------------------------------------------------------------|:----------|
|  Easy  | 704. Binary Search                                          | https://leetcode.com/problems/binary-search/                                           | 5         |
|  Easy  | 35. Search Insert Position                                  | https://leetcode.com/problems/search-insert-position/                                  | 3         |
| Medium | 34. Find First and Last Position of Element in Sorted Array | https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ | 2         |
| Medium | 74. Search a 2D Matrix                                      | https://leetcode.com/problems/search-a-2d-matrix/                                      | 3         |
| Medium | 153. Find Minimum in Rotated Sorted Array                   | https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/                    | 2         |
| Medium | 33. Search in Rotated Sorted Array                          | https://leetcode.com/problems/search-in-rotated-sorted-array/                          | 2         |
| Medium | 162. Find Peak Element                                      | https://leetcode.com/problems/find-peak-element/                                       | 2         |
| Medium | 875. Koko Eating Bananas                                    | https://leetcode.com/problems/koko-eating-bananas/                                     | 2         |

## 1.8 Intervals

|   Level   | Name                                                 | Link                                                                          | Retention |
|:---------:|:-----------------------------------------------------|:------------------------------------------------------------------------------|:----------|
|  Medium   | 56. Merge Intervals                                  | https://leetcode.com/problems/merge-intervals/                                |           |
|  Medium   | 57. Insert Interval                                  | https://leetcode.com/problems/insert-interval/                                |           |
|  Medium   | 435. Non-overlapping Intervals                       | https://leetcode.com/problems/non-overlapping-intervals/                      |           |
|  Medium   | 452. Minimum Number of Arrows to Burst Balloons      | https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/     |           |
|  Medium   | 986. Interval List Intersections                     | https://leetcode.com/problems/interval-list-intersections/                    |           |
| Medium(-) | 763. Partition Labels                                | https://leetcode.com/problems/partition-labels/                               |           |
|  Medium   | 2406. Divide Intervals Into Minimum Number of Groups | https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/ |           |
|  Medium   | 1288. Remove Covered Intervals                       | https://leetcode.com/problems/remove-covered-intervals/                       |           |

# 2 Linked Lists & Trees

## 2.1 Linked List

| Level  | Name                                          | Link                                                                   | Retention |
|:------:|:----------------------------------------------|:-----------------------------------------------------------------------|:----------|
| Medium | 707. Design Linked List                       | https://leetcode.com/problems/design-linked-list/                      |           |
|  Easy  | 876. Middle of the Linked List                | https://leetcode.com/problems/middle-of-the-linked-list/               |           |
| Medium | 2095. Delete the Middle Node of a Linked List | https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/ |           |
|  Easy  | 206. Reverse Linked List                      | https://leetcode.com/problems/reverse-linked-list/                     |           |
|  Easy  | 234. Palindrome Linked List                   | https://leetcode.com/problems/palindrome-linked-list/                  |           |
|  Easy  | 83. Remove Duplicates from Sorted List        | https://leetcode.com/problems/remove-duplicates-from-sorted-list/      |           |
| Medium | 19. Remove Nth Node From End of List          | https://leetcode.com/problems/remove-nth-node-from-end-of-list/        |           |
| Medium | 24. Swap Nodes in Pairs                       | https://leetcode.com/problems/swap-nodes-in-pairs/                     |           |
|  Easy  | 21. Merge Two Sorted Lists                    | https://leetcode.com/problems/merge-two-sorted-lists/                  |           |
|  Easy  | 141. Linked List Cycle                        | https://leetcode.com/problems/linked-list-cycle/                       |           |
| Medium | 146. LRU Cache                                | https://leetcode.com/problems/lru-cache/                               |           |
|  Easy  | 206. Reverse Linked List                      | https://leetcode.com/problems/reverse-linked-list/                     |           |
|  Easy  | 21. Merge Two Sorted Lists                    | https://leetcode.com/problems/merge-two-sorted-lists/                  |           |
|  Easy  | 141. Linked List Cycle                        | https://leetcode.com/problems/linked-list-cycle/                       |           |
| Medium | 142. Linked List Cycle II                     | https://leetcode.com/problems/linked-list-cycle-ii/                    |           |
| Medium | 876. Middle of the Linked List                | https://leetcode.com/problems/middle-of-the-linked-list/               |           |
| Medium | 19. Remove Nth Node From End of List          | https://leetcode.com/problems/remove-nth-node-from-end-of-list/        |           |
| Medium | 2. Add Two Numbers                            | https://leetcode.com/problems/add-two-numbers/                         |           |
| Medium | 234. Palindrome Linked List                   | https://leetcode.com/problems/palindrome-linked-list/                  |           |
| Medium | 143. Reorder List                             | https://leetcode.com/problems/reorder-list/                            |           |
| Medium | 138. Copy List with Random Pointer            | https://leetcode.com/problems/copy-list-with-random-pointer/           |           |
| Medium | 24. Swap Nodes in Pairs                       | https://leetcode.com/problems/swap-nodes-in-pairs/                     |           |

## 2.2 Binary Tree DFS

| Level  | Name                                                           | Link                                                                                     | Retention |
|:------:|:---------------------------------------------------------------|:-----------------------------------------------------------------------------------------|:----------|
|  Easy  | 104. Maximum Depth of Binary Tree                              | https://leetcode.com/problems/maximum-depth-of-binary-tree/                              |           |
|  Easy  | 226. Invert Binary Tree                                        | https://leetcode.com/problems/invert-binary-tree/                                        |           |
|  Easy  | 100. Same Tree                                                 | https://leetcode.com/problems/same-tree/                                                 |           |
|  Easy  | 101. Symmetric Tree                                            | https://leetcode.com/problems/symmetric-tree/                                            |           |
|  Easy  | 112. Path Sum                                                  | https://leetcode.com/problems/path-sum/                                                  |           |
|  Easy  | 104. Maximum Depth of Binary Tree                              | https://leetcode.com/problems/maximum-depth-of-binary-tree/                              |           |
|  Easy  | 226. Invert Binary Tree                                        | https://leetcode.com/problems/invert-binary-tree/                                        |           |
| Medium | 100. Same Tree                                                 | https://leetcode.com/problems/same-tree/                                                 |           |
| Medium | 101. Symmetric Tree                                            | https://leetcode.com/problems/symmetric-tree/                                            |           |
|  Easy  | 112. Path Sum                                                  | https://leetcode.com/problems/path-sum/                                                  |           |
| Medium | 543. Diameter of Binary Tree                                   | https://leetcode.com/problems/diameter-of-binary-tree/                                   |           |
| Medium | 236. Lowest Common Ancestor of a Binary Tree                   | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/                   |           |
| Medium | 105. Construct Binary Tree from Preorder and Inorder Traversal | https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ |           |
| Medium | 114. Flatten Binary Tree to Linked List                        | https://leetcode.com/problems/flatten-binary-tree-to-linked-list/                        |           |

## 2.3 Binary Tree BFS

| Level  | Name                                                | Link                                                                          | Retention |
|:------:|:----------------------------------------------------|:------------------------------------------------------------------------------|:----------|
| Medium | 102. Binary Tree Level Order Traversal              | https://leetcode.com/problems/binary-tree-level-order-traversal/              |           |
| Medium | 515. Find Largest Value in Each Tree Row            | https://leetcode.com/problems/find-largest-value-in-each-tree-row/            |           |
| Medium | 199. Binary Tree Right Side View                    | https://leetcode.com/problems/binary-tree-right-side-view/                    |           |
| Medium | 117. Populating Next Right Pointers in Each Node II | https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ |           |
| Medium | 236. Lowest Common Ancestor of a Binary Tree        | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/        |           |
| Medium | 1325. Delete Leaves With a Given Value              | https://leetcode.com/problems/delete-leaves-with-a-given-value/               |           |
| Medium | 1302. Deepest Leaves Sum                            | https://leetcode.com/problems/deepest-leaves-sum/                             |           |
|  Easy  | 543. Diameter of Binary Tree                        | https://leetcode.com/problems/diameter-of-binary-tree/                        |           |
| Medium | 103. Binary Tree Zigzag Level Order Traversal       | https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/       |           |
|  Easy  | 637. Average of Levels in Binary Tree               | https://leetcode.com/problems/average-of-levels-in-binary-tree/               | -         |
| Medium | 102. Binary Tree Level Order Traversal              | https://leetcode.com/problems/binary-tree-level-order-traversal/              |           |
| Medium | 103. Binary Tree Zigzag Level Order Traversal       | https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/       |           |
| Medium | 199. Binary Tree Right Side View                    | https://leetcode.com/problems/binary-tree-right-side-view/                    |           |
| Medium | 515. Find Largest Value in Each Tree Row            | https://leetcode.com/problems/find-largest-value-in-each-tree-row/            |           |
| Medium | 513. Find Bottom Left Tree Value                    | https://leetcode.com/problems/find-bottom-left-tree-value/                    |           |
| Medium | 1302. Deepest Leaves Sum                            | https://leetcode.com/problems/deepest-leaves-sum/                             |           |
| Medium | 117. Populating Next Right Pointers in Each Node II | https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ |           |
| Medium | 116. Populating Next Right Pointers in Each Node    | https://leetcode.com/problems/populating-next-right-pointers-in-each-node/    |           |
| Medium | 987. Vertical Order Traversal of a Binary Tree      | https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/      | 1         |

## 2.4 Binary Search Tree BST

| Level  | Name                                            | Link                                                                      | Retention |
|:------:|:------------------------------------------------|:--------------------------------------------------------------------------|:----------|
|  Easy  | 700. Search in a Binary Search Tree             | https://leetcode.com/problems/search-in-a-binary-search-tree/             |           |
| Medium | 701. Insert into a Binary Search Tree           | https://leetcode.com/problems/insert-into-a-binary-search-tree/           |           |
| Medium | 98. Validate Binary Search Tree                 | https://leetcode.com/problems/validate-binary-search-tree/                |           |
|  Easy  | 110. Balanced Binary Tree                       | https://leetcode.com/problems/balanced-binary-tree/                       |           |
|  Easy  | 700. Search in a Binary Search Tree             | https://leetcode.com/problems/search-in-a-binary-search-tree/             |           |
|  Easy  | 108. Convert Sorted Array to Binary Search Tree | https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ |           |
| Medium | 98. Validate Binary Search Tree                 | https://leetcode.com/problems/validate-binary-search-tree/                |           |
|  Easy  | 110. Balanced Binary Tree                       | https://leetcode.com/problems/balanced-binary-tree/                       |           |      
| Medium | 701. Insert into a Binary Search Tree           | https://leetcode.com/problems/insert-into-a-binary-search-tree/           |           |
| Medium | 450. Delete Node in a BST                       | https://leetcode.com/problems/delete-node-in-a-bst/                       |           |
| Medium | 230. Kth Smallest Element in a BST              | https://leetcode.com/problems/kth-smallest-element-in-a-bst/              |           |
| Medium | 173. Binary Search Tree Iterator                | https://leetcode.com/problems/binary-search-tree-iterator/                |           |
| Medium | 538. Convert BST to Greater Tree                | https://leetcode.com/problems/convert-bst-to-greater-tree/                |           |

## 2.5 Trie

| Level  | Name                              | Link                                                      | Retention |
|:------:|:----------------------------------|:----------------------------------------------------------|:----------|
| Medium | 208. Implement Trie (Prefix Tree) | https://leetcode.com/problems/implement-trie-prefix-tree/ |           |
| Medium | 1268. Search Suggestions System   | https://leetcode.com/problems/search-suggestions-system/  |           |

## 2.6 Heap

| Level  | Name                                      | Link                                                               | Retention |
|:------:|:------------------------------------------|:-------------------------------------------------------------------|:----------|
| Medium | 215. Kth Largest Element in an Array      | https://leetcode.com/problems/kth-largest-element-in-an-array/     |           |
|  Easy  | 703. Kth Largest Element in a Stream      | https://leetcode.com/problems/kth-largest-element-in-a-stream/     |           |
| Medium | 347. Top K Frequent Elements              | https://leetcode.com/problems/top-k-frequent-elements/             |           |
| Medium | 451. Sort Characters By Frequency         | https://leetcode.com/problems/sort-characters-by-frequency/        |           |
|  Easy  | 1046. Last Stone Weight                   | https://leetcode.com/problems/last-stone-weight/                   |           |
|  Hard  | 502. IPO                                  | https://leetcode.com/problems/ipo/                                 |           |
|  Hard  | 295. Find Median from Data Stream         | https://leetcode.com/problems/find-median-from-data-stream/        |           |
| Medium | 1962. Remove Stones to Minimize the Total | https://leetcode.com/problems/remove-stones-to-minimize-the-total/ |           |
|  Hard  | 23. Merge k Sorted Lists                  | https://leetcode.com/problems/merge-k-sorted-lists/                |           |

# 3 Graphs

## 3.1 Graph General

| Level  | Name                                                | Link                                                                         | Retention |
|:------:|:----------------------------------------------------|:-----------------------------------------------------------------------------|:----------|
| Medium | 841. Keys and Rooms                                 | https://leetcode.com/problems/keys-and-rooms/                                |           |
| Medium | 1971. Find if Path Exists in Graph                  | https://leetcode.com/problems/find-if-path-exists-in-graph/                  |           |
| Medium | 133. Clone Graph                                    | https://leetcode.com/problems/clone-graph/                                   |           |
| Medium | 1557. Minimum Number of Vertices to Reach All Nodes | https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/ |           |

## 3.2 Graph DFS

| Level  | Name                                                         | Link                                                                                  | Retention |
|:------:|:-------------------------------------------------------------|:--------------------------------------------------------------------------------------|:----------|
| Medium | 547. Number of Provinces                                     | https://leetcode.com/problems/number-of-provinces/                                    |           |
| Medium | 200. Number of Islands                                       | https://leetcode.com/problems/number-of-islands/                                      |           |
| Medium | 1466. Reorder Routes to Make All Paths Lead to the City Zero | https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/ |           |
| Medium | 695. Max Area of Island                                      | https://leetcode.com/problems/max-area-of-island/                                     |           |
| Medium | 2368. Reachable Nodes With Restrictions                      | https://leetcode.com/problems/reachable-nodes-with-restrictions/                      |           |
| Medium | 542. 01 Matrix                                               | https://leetcode.com/problems/01-matrix/                                              |           |

## 3.3 Graph BFS

| Level  | Name                                        | Link                                                                 | Retention |
|:------:|:--------------------------------------------|:---------------------------------------------------------------------|:----------|
| Medium | 1129. Shortest Path with Alternating Colors | https://leetcode.com/problems/shortest-path-with-alternating-colors/ |           | 
| Medium | 1926. Nearest Exit from Entrance in Maze    | https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/    |           | 
| Medium | 1091. Shortest Path in Binary Matrix        | https://leetcode.com/problems/shortest-path-in-binary-matrix/        |           | 
| Medium | 752. Open the Lock                          | https://leetcode.com/problems/open-the-lock/                         |           |
| Medium | 433. Minimum Genetic Mutation               | https://leetcode.com/problems/minimum-genetic-mutation/              |           |
| Medium | 994. Rotting Oranges                        | https://leetcode.com/problems/rotting-oranges/                       |           |

## 3.4 Dijkstra

| Level  | Name                                 | Link                                                           | Retention |
|:------:|:-------------------------------------|:---------------------------------------------------------------|:----------|
| Medium | 743. Network Delay Time              | https://leetcode.com/problems/network-delay-time/              |           | 
| Medium | 1514. Path with Maximum Probability  | https://leetcode.com/problems/path-with-maximum-probability/   |           | 
| Medium | 787. Cheapest Flights Within K Stops | https://leetcode.com/problems/cheapest-flights-within-k-stops/ |           | 

## 3.5 Topological sort

| Level  | Name                                                | Link                                                                         | Retention |
|:------:|:----------------------------------------------------|:-----------------------------------------------------------------------------|:----------|
| Medium | 2115. Find All Possible Recipes from Given Supplies | https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/ |           | 
| Medium | 207. Course Schedule                                | https://leetcode.com/problems/course-schedule/                               |           | 
| Medium | 210. Course Schedule II                             | https://leetcode.com/problems/course-schedule-ii/                            |           | 

## Backtracking

| Level  | Name                                      | Link                                                                 | Retention |
|:------:|:------------------------------------------|:---------------------------------------------------------------------|:----------|
| Medium | 46. Permutations                          | https://leetcode.com/problems/permutations/                          |           |
| Medium | 77. Combinations                          | https://leetcode.com/problems/combinations/                          |           |
| Medium | 78. Subsets                               | https://leetcode.com/problems/subsets/                               |           |
| Medium | 22. Generate Parentheses                  | https://leetcode.com/problems/generate-parentheses/                  |           |
| Medium | 216. Combination Sum III                  | https://leetcode.com/problems/combination-sum-iii/                   |           |
| Medium | 17. Letter Combinations of a Phone Number | https://leetcode.com/problems/letter-combinations-of-a-phone-number/ |           |
|  Hard  | 51. N-Queens                              | https://leetcode.com/problems/n-queens/                              |           |
|  Hard  | 489. Robot room cleaner                   | https://leetcode.com/problems/robot-room-cleaner/                    |           |
|  Easy  | 257. Binary Tree Paths                    | https://leetcode.com/problems/binary-tree-paths/                     | 2         |
| Medium | 784. Letter Case Permutation              | https://leetcode.com/problems/letter-case-permutation/               | 2         |
| Medium | 78. Subsets                               | https://leetcode.com/problems/subsets/                               | 2         |
| Medium | 46. Permutations                          | https://leetcode.com/problems/permutations/                          |           |
| Medium | 39. Combination Sum                       | https://leetcode.com/problems/combination-sum/                       |           |
| Medium | 17. Letter Combinations of a Phone Number | https://leetcode.com/problems/letter-combinations-of-a-phone-number/ |           |
| Medium | 22. Generate Parentheses                  | https://leetcode.com/problems/generate-parentheses/                  |           |
| Medium | 79. Word Search                           | https://leetcode.com/problems/word-search/                           |           |
| Medium | 90. Subsets II                            | https://leetcode.com/problems/subsets-ii/                            |           |
| Medium | 77. Combinations                          | https://leetcode.com/problems/combinations/                          |           |

Топ-8 задач Backtracking для собеседования (80% покрытия)
№ Уровень Название Суть задачи (почему она популярна)
1 Medium 78. Subsets Классика. Сгенерировать все возможные подмножества. Это базовая задача на "Decision Tree", где
нужно решать: брать элемент или не брать.
2 Medium 46. Permutations Классика. Сгенерировать все перестановки массива [citations:1][citations:6]. Проверяет, как вы
управляете "посещенными" элементами.
3 Medium 39. Combination Sum Генерация комбинаций чисел, дающих целевую сумму [citations:2]. Элементы можно использовать
неограниченно.
4 Medium 17. Letter Combinations of a Phone Number Must-have для мобильной разработки. Нужно сгенерировать все буквенные
комбинации по цифрам на телефоне .
5 Medium 22. Generate Parentheses Генерация правильных скобочных последовательностей. Очень популярная задача на
проверку понимания ограничений (условий остановки) в рекурсии .
6 Medium 79. Word Search Поиск слова в двумерной сетке (матрице) . Проверяет умение ходить в 4 стороны и откатывать
состояние ("visited").
7 Medium 90. Subsets II Тоже генерация подмножеств, НО с дубликатами . Проверяет, умеете ли вы пропускать повторяющиеся
варианты.
8 Medium 77. Combinations Генерация всех возможных комбинаций длины k . Комбинации проще перестановок, так как порядок
не важен.
🧠 Что в итоге?
Этот набор задач покрывает все ключевые сценарии бэктрекинга:

Работа с индексами: Subsets, Combinations.

Работа с visited-массивом: Permutations, Word Search.

Суммирование/отсечения: Combination Sum, Generate Parentheses.

Мэппинг и строки: Letter Combinations.

Если вы уверенно решаете эти 8 задач, вы готовы к 90% вопросов по Backtracking на собеседовании в FAANG и других топовых
компаниях .

Рекомендация: Обязательно начните с Subsets и Permutations. Понимание этих двух паттернов автоматически откроет вам
решение остальных задач из списка.

Нужно разобрать алгоритм или код для какой-то из этих задач?

Расположи задачи в логической последовательности от более простых к более сложным, а также к каждой задаче дай
минимальную теорию
Отлично, давайте выстроим логическую последовательность изучения Backtracking. Я расположу задачи от самых простых (
введение в паттерн) к самым сложным (комбинации с ограничениями и обход матриц).

Также дам минимальную теорию к каждой — то, что нужно знать перед решением.

4.
    77. Combinations (Medium)
        Почему здесь: Это производная от 78. Subsets, но мы ограничены размером k. Учимся контролировать глубину
        рекурсии.

Суть: Вернуть все сочетания из n по k (порядок не важен).

Техника: То же, что и 78, но остановка, когда subset.size() == k.

5.
    90. Subsets II (Medium) 🔥 Продвинутые подмножества
        Почему здесь: Усложнение 78 — в массиве есть дубликаты. Нужно научиться пропускать повторы, чтобы в ответе не
        было [1,2] дважды.

Суть: Сгенерировать все уникальные подмножества (массив может содержать дубликаты).

Техника: Сортировка + в цикле if (i > start && nums[i] == nums[i-1]) continue;.

6.
    39. Combination Sum (Medium) 🔥 Комбинации под сумму
        Почему здесь: Мы больше не просто собираем подмножества, а ищем сумму. Также важное отличие: один элемент можно
        использовать неограниченно.

Суть: Найти все уникальные комбинации чисел, дающие target.

Техника: Рекурсия с start (чтобы не было перестановок) и передачей остатка target - nums[i].

7.
    46. Permutations (Medium) 🔥 Фундамент для перестановок
        Почему здесь: В отличие от сочетаний, здесь важен порядок ([1,2] и [2,1] — разные ответы). Нужен visited массив.

Суть: Вернуть все возможные перестановки (порядок важен).

Техника: Используем boolean[] used. В цикле перебираем все элементы, пропускаем уже used.

8.
    17. Letter Combinations of a Phone Number (Medium)
        Почему здесь: Backtracking с маппингом. Задача показывает, как строить строки на основе данных из таблицы (
        цифра -> буквы).

Суть: Сгенерировать все буквенные комбинации, которые соответствуют нажатию кнопок на телефоне.

Техника: Маппинг цифр в строки. Рекурсия по index строки с цифрами.

9.
    22. Generate Parentheses (Medium) 🔥 Генерация скобок
        Почему здесь: Это задача на ограничения. Мы не можем поставить закрывающую скобку, если еще нет открывающей. Это
        учит отсекать заведомо неверные пути (pruning).

Суть: Сгенерировать все правильные скобочные последовательности длины 2 n.

Техника: Рекурсия с параметрами open и close. Добавляем '(', если open < n. Добавляем ')', если close < open.

10.
    79. Word Search (Medium) 🔥 Поиск в матрице
        Почему здесь: Вершина бэктрекинга. Нужно управлять посещенными ячейками и ходить в 4 стороны. Сложность в
        обработке соседей и откате (убирании visited).

Суть: Проверить, существует ли слово в сетке (буквы должны быть соседними).

Техника: DFS по сетке. Пробуем начать с каждой ячейки. Красим board[i][j] = '#' (или visited[][]), чтобы не ходить по
кругу.

## Dynamic Programming

| Level  | Name                          | Link                                                    | Retention |
|:------:|:------------------------------|:--------------------------------------------------------|:----------|
|  Easy  | 509. Fibonacci Number         | https://leetcode.com/problems/fibonacci-number/         |           | 
|  Easy  | 70. Climbing Stairs           | https://leetcode.com/problems/climbing-stairs/          |           | 
|  Easy  | 746. Min Cost Climbing Stairs | https://leetcode.com/problems/min-cost-climbing-stairs/ |           | 
| Medium | 322. Coin Change              | https://leetcode.com/problems/coin-change/              |           |
| Medium | 198. House Robber             | https://leetcode.com/problems/house-robber/             |           |
| Medium | 91. Decode Ways               | https://leetcode.com/problems/decode-ways/              |           |
| Medium | 62. Unique Paths              | https://leetcode.com/problems/unique-paths/             |           |
| Medium | 64. Minimum Path Sum          | https://leetcode.com/problems/minimum-path-sum/         |           |            |
| Medium | 72. Edit Distance             | https://leetcode.com/problems/edit-distance/            |           |

---

ID,URL,Title,Difficulty,Acceptance %,Frequency %
1,https://leetcode.com/problems/two-sum,Two Sum,Easy,57.1%,75.0%
2,https://leetcode.com/problems/add-two-numbers,Add Two Numbers,Medium,47.9%,50.0%
4,https://leetcode.com/problems/median-of-two-sorted-arrays,Median of Two Sorted Arrays,Hard,45.9%,50.0%
5,https://leetcode.com/problems/longest-palindromic-substring,Longest Palindromic Substring,Medium,37.3%,62.5%
7,https://leetcode.com/problems/reverse-integer,Reverse Integer,Medium,31.5%,37.5%
20,https://leetcode.com/problems/valid-parentheses,Valid Parentheses,Easy,43.7%,62.5%
21,https://leetcode.com/problems/merge-two-sorted-lists,Merge Two Sorted Lists,Easy,67.9%,62.5%
22,https://leetcode.com/problems/generate-parentheses,Generate Parentheses,Medium,78.2%,50.0%
23,https://leetcode.com/problems/merge-k-sorted-lists,Merge k Sorted Lists,Hard,58.8%,50.0%
33,https://leetcode.com/problems/search-in-rotated-sorted-array,Search in Rotated Sorted Array,Medium,44.1%,50.0%
56,https://leetcode.com/problems/merge-intervals,Merge Intervals,Medium,51.1%,75.0%
71,https://leetcode.com/problems/simplify-path,Simplify Path,Medium,50.0%,50.0%
76,https://leetcode.com/problems/minimum-window-substring,Minimum Window Substring,Hard,46.9%,50.0%
98,https://leetcode.com/problems/validate-binary-search-tree,Validate Binary Search Tree,Medium,35.3%,37.5%
101,https://leetcode.com/problems/symmetric-tree,Symmetric Tree,Easy,60.7%,50.0%
103,https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal,Binary Tree Zigzag Level Order
Traversal,Medium,63.1%,37.5%
110,https://leetcode.com/problems/balanced-binary-tree,Balanced Binary Tree,Easy,57.8%,37.5%
124,https://leetcode.com/problems/binary-tree-maximum-path-sum,Binary Tree Maximum Path Sum,Hard,42.0%,50.0%
146,https://leetcode.com/problems/lru-cache,LRU Cache,Medium,46.8%,50.0%
150,https://leetcode.com/problems/evaluate-reverse-polish-notation,Evaluate Reverse Polish Notation,Medium,57.0%,25.0%
153,https://leetcode.com/problems/find-minimum-in-rotated-sorted-array,Find Minimum in Rotated Sorted
Array,Medium,53.8%,37.5%
155,https://leetcode.com/problems/min-stack,Min Stack,Medium,57.7%,62.5%
161,https://leetcode.com/problems/one-edit-distance,One Edit Distance,Medium,34.5%,75.0%
199,https://leetcode.com/problems/binary-tree-right-side-view,Binary Tree Right Side View,Medium,69.5%,50.0%
200,https://leetcode.com/problems/number-of-islands,Number of Islands,Medium,63.8%,75.0%
205,https://leetcode.com/problems/isomorphic-strings,Isomorphic Strings,Easy,48.0%,75.0%
206,https://leetcode.com/problems/reverse-linked-list,Reverse Linked List,Easy,80.2%,37.5%
220,https://leetcode.com/problems/contains-duplicate-iii,Contains Duplicate III,Hard,24.4%,25.0%
228,https://leetcode.com/problems/summary-ranges,Summary Ranges,Easy,53.9%,87.5%
234,https://leetcode.com/problems/palindrome-linked-list,Palindrome Linked List,Easy,57.4%,25.0%
236,https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree,Lowest Common Ancestor of a Binary
Tree,Medium,68.7%,50.0%
235,https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree,Lowest Common Ancestor of a Binary
Search Tree,Medium,70.0%,37.5%
238,https://leetcode.com/problems/product-of-array-except-self,Product of Array Except Self,Medium,68.6%,50.0%
242,https://leetcode.com/problems/valid-anagram,Valid Anagram,Easy,67.8%,37.5%
986,https://leetcode.com/problems/interval-list-intersections,Interval List Intersections,Medium,72.9%,62.5%
279,https://leetcode.com/problems/perfect-squares,Perfect Squares,Medium,56.3%,50.0%
300,https://leetcode.com/problems/longest-increasing-subsequence,Longest Increasing Subsequence,Medium,59.0%,37.5%
2241,https://leetcode.com/problems/design-an-atm-machine,Design an ATM Machine,Medium,44.5%,62.5%
332,https://leetcode.com/problems/reconstruct-itinerary,Reconstruct Itinerary,Hard,44.3%,50.0%
340,https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters,Longest Substring with At Most K
Distinct Characters,Medium,49.9%,50.0%
347,https://leetcode.com/problems/top-k-frequent-elements,Top K Frequent Elements,Medium,65.8%,25.0%
349,https://leetcode.com/problems/intersection-of-two-arrays,Intersection of Two Arrays,Easy,77.5%,37.5%
350,https://leetcode.com/problems/intersection-of-two-arrays-ii,Intersection of Two Arrays II,Easy,59.7%,37.5%
356,https://leetcode.com/problems/line-reflection,Line Reflection,Medium,36.3%,75.0%
362,https://leetcode.com/problems/design-hit-counter,Design Hit Counter,Medium,69.6%,50.0%
380,https://leetcode.com/problems/insert-delete-getrandom-o1,Insert Delete GetRandom O(1),Medium,55.3%,75.0%
387,https://leetcode.com/problems/first-unique-character-in-a-string,First Unique Character in a String,Easy,65.0%,37.5%
395,https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters,Longest Substring with At Least
K Repeating Characters,Medium,46.0%,25.0%
424,https://leetcode.com/problems/longest-repeating-character-replacement,Longest Repeating Character
Replacement,Medium,59.0%,37.5%
438,https://leetcode.com/problems/find-all-anagrams-in-a-string,Find All Anagrams in a String,Medium,53.3%,75.0%
443,https://leetcode.com/problems/string-compression,String Compression,Medium,59.5%,87.5%
485,https://leetcode.com/problems/max-consecutive-ones,Max Consecutive Ones,Easy,64.6%,37.5%
487,https://leetcode.com/problems/max-consecutive-ones-ii,Max Consecutive Ones II,Medium,51.9%,25.0%
523,https://leetcode.com/problems/continuous-subarray-sum,Continuous Subarray Sum,Medium,31.2%,37.5%
1436,https://leetcode.com/problems/destination-city,Destination City,Easy,79.5%,37.5%
560,https://leetcode.com/problems/subarray-sum-equals-k,Subarray Sum Equals K,Medium,46.8%,75.0%
567,https://leetcode.com/problems/permutation-in-string,Permutation in String,Medium,48.4%,75.0%
605,https://leetcode.com/problems/can-place-flowers,Can Place Flowers,Easy,29.0%,37.5%
652,https://leetcode.com/problems/find-duplicate-subtrees,Find Duplicate Subtrees,Medium,60.6%,50.0%
658,https://leetcode.com/problems/find-k-closest-elements,Find K Closest Elements,Medium,49.4%,87.5%
680,https://leetcode.com/problems/valid-palindrome-ii,Valid Palindrome II,Easy,44.0%,75.0%
2627,https://leetcode.com/problems/debounce,Debounce,Medium,91.8%,37.5%
2657,https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays,Find the Prefix Common Array of Two
Arrays,Medium,87.0%,75.0%
763,https://leetcode.com/problems/partition-labels,Partition Labels,Medium,81.8%,25.0%
771,https://leetcode.com/problems/jewels-and-stones,Jewels and Stones,Easy,89.5%,37.5%
849,https://leetcode.com/problems/maximize-distance-to-closest-person,Maximize Distance to Closest
Person,Medium,49.6%,87.5%
896,https://leetcode.com/problems/monotonic-array,Monotonic Array,Easy,62.2%,50.0%
933,https://leetcode.com/problems/number-of-recent-calls,Number of Recent Calls,Easy,78.1%,50.0%
1868,https://leetcode.com/problems/product-of-two-run-length-encoded-arrays,Product of Two Run-Length Encoded
Arrays,Medium,59.6%,37.5%
68,https://leetcode.com/problems/text-justification,Text Justification,Hard,50.4%,25.0%
674,https://leetcode.com/problems/longest-continuous-increasing-subsequence,Longest Continuous Increasing
Subsequence,Easy,51.8%,37.5%
3105,https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray,Longest Strictly
Increasing or Strictly Decreasing Subarray,Easy,64.9%,75.0%
938,https://leetcode.com/problems/range-sum-of-bst,Range Sum of BST,Easy,87.6%,37.5%
17,https://leetcode.com/problems/letter-combinations-of-a-phone-number,Letter Combinations of a Phone
Number,Medium,65.5%,37.5%
227,https://leetcode.com/problems/basic-calculator-ii,Basic Calculator II,Medium,46.6%,50.0%
322,https://leetcode.com/problems/coin-change,Coin Change,Medium,47.9%,37.5%
2841,https://leetcode.com/problems/maximum-sum-of-almost-unique-subarray,Maximum Sum of Almost Unique
Subarray,Medium,40.7%,25.0%
2743,https://leetcode.com/problems/count-substrings-without-repeating-character,Count Substrings Without Repeating
Character,Medium,76.1%,50.0%
13,https://leetcode.com/problems/roman-to-integer,Roman to Integer,Easy,66.2%,25.0%
2570,https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values,Merge Two 2D Arrays by Summing
Values,Easy,81.8%,25.0%
470,https://leetcode.com/problems/implement-rand10-using-rand7,Implement Rand10() Using Rand7(),Medium,46.2%,25.0%
232,https://leetcode.com/problems/implement-queue-using-stacks,Implement Queue using Stacks,Easy,69.3%,37.5%
1656,https://leetcode.com/problems/design-an-ordered-stream,Design an Ordered Stream,Easy,82.6%,25.0%
881,https://leetcode.com/problems/boats-to-save-people,Boats to Save People,Medium,61.4%,25.0%
19,https://leetcode.com/problems/remove-nth-node-from-end-of-list,Remove Nth Node From End of List,Medium,51.0%,37.5%
739,https://leetcode.com/problems/daily-temperatures,Daily Temperatures,Medium,68.3%,37.5%
102,https://leetcode.com/problems/binary-tree-level-order-traversal,Binary Tree Level Order Traversal,Medium,72.2%,25.0%
295,https://leetcode.com/problems/find-median-from-data-stream,Find Median from Data Stream,Hard,54.2%,37.5%
415,https://leetcode.com/problems/add-strings,Add Strings,Easy,52.1%,37.5%
24,https://leetcode.com/problems/swap-nodes-in-pairs,Swap Nodes in Pairs,Medium,68.9%,25.0%
1650,https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii,Lowest Common Ancestor of a Binary Tree
III,Medium,82.9%,25.0%
53,https://leetcode.com/problems/maximum-subarray,Maximum Subarray,Medium,53.0%,37.5%
141,https://leetcode.com/problems/linked-list-cycle,Linked List Cycle,Easy,53.9%,25.0%
2667,https://leetcode.com/problems/create-hello-world-function,Create Hello World Function,Easy,82.0%,25.0%
1572,https://leetcode.com/problems/matrix-diagonal-sum,Matrix Diagonal Sum,Easy,84.1%,37.5%
1386,https://leetcode.com/problems/cinema-seat-allocation,Cinema Seat Allocation,Medium,43.6%,25.0%
239,https://leetcode.com/problems/sliding-window-maximum,Sliding Window Maximum,Hard,48.4%,25.0%
2665,https://leetcode.com/problems/counter-ii,Counter II,Easy,81.2%,25.0%
35,https://leetcode.com/problems/search-insert-position,Search Insert Position,Easy,50.7%,25.0%
2666,https://leetcode.com/problems/allow-one-function-call,Allow One Function Call,Easy,86.7%,37.5%
1496,https://leetcode.com/problems/path-crossing,Path Crossing,Easy,62.6%,37.5%
994,https://leetcode.com/problems/rotting-oranges,Rotting Oranges,Medium,58.1%,25.0%
181,https://leetcode.com/problems/employees-earning-more-than-their-managers,Employees Earning More Than Their
Managers,Easy,72.8%,25.0%
2215,https://leetcode.com/problems/find-the-difference-of-two-arrays,Find the Difference of Two Arrays,Easy,81.3%,25.0%
2043,https://leetcode.com/problems/simple-bank-system,Simple Bank System,Medium,69.8%,25.0%
2956,https://leetcode.com/problems/find-common-elements-between-two-arrays,Find Common Elements Between Two
Arrays,Easy,84.4%,25.0%
341,https://leetcode.com/problems/flatten-nested-list-iterator,Flatten Nested List Iterator,Medium,65.6%,25.0%
974,https://leetcode.com/problems/subarray-sums-divisible-by-k,Subarray Sums Divisible by K,Medium,56.0%,25.0%
2629,https://leetcode.com/problems/function-composition,Function Composition,Easy,86.9%,37.5%
9,https://leetcode.com/problems/palindrome-number,Palindrome Number,Easy,60.2%,25.0%
74,https://leetcode.com/problems/search-a-2d-matrix,Search a 2D Matrix,Medium,53.5%,25.0%
2006,https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k,Count Number of Pairs With Absolute
Difference K,Easy,85.3%,25.0%
1438,https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit,Longest
Continuous Subarray With Absolute Diff Less Than or Equal to Limit,Medium,57.3%,25.0%

---

Недостающие задачи (есть в итоговом списке, нет в вашем)
Тема ID недостающих задач
Hash Map 146, 205, 349, 350, 380, 387, 652, 771, 1436
Binary Search 4, 33
Two Pointers 680
Sliding Window 340, 395, 485, 487
Prefix Sum 523
Intervals 986
Stack, Queue 227, 341, 739, 933
Linked List 23, 24
Binary Tree (DFS)    110, 124, 235
Binary Tree (BFS)    103
BST 98, 110, 235
Backtracking 17, 22
Примечания

110. Balanced Binary Tree — относится и к DFS, и к BST (попала в две темы)

235. Lowest Common Ancestor of a BST — относится и к DFS, и к BST

Задачи 4, 33, 124, 146, 220, 239, 295, 322, 332, 340, 341, 347, 356, 362, 395, 424, 438, 443, 487, 523, 560, 567,
605, 652, 658, 763, 849, 881, 938, 986, 1438, 1868, 2241, 2657, 2743, 2841, 3105 — есть в
итоговом списке, но отсутствуют в вашем и не вошли в таблицу выше, так как их тема не совпала с вашими 12 категориями.

Хорошо, тогда задачи, которые не вошли в список разбей также по темам, которых у меня нет
Задачи из итогового списка, которые не вошли в ваши 12 тем — разбивка по новым темам

1. Dynamic Programming (DP)
   ID Название Уровень Частота
   5 Longest Palindromic Substring Medium 62.5%
   53 Maximum Subarray Medium 37.5%
   300 Longest Increasing Subsequence Medium 37.5%
   322 Coin Change Medium 37.5%
   124 Binary Tree Maximum Path Sum Hard 50%
   279 Perfect Squares Medium 50%
2. Graph / Matrix Traversal (BFS/DFS на графах)
   ID Название Уровень Частота
   200 Number of Islands Medium 75%
   994 Rotting Oranges Medium 25%
   332 Reconstruct Itinerary Hard 50%
   1572 Matrix Diagonal Sum Easy 25%
   1650 Lowest Common Ancestor III Medium 25%
3. Heap / Priority Queue
   ID Название Уровень Частота
   23 Merge k Sorted Lists Hard 50%
   347 Top K Frequent Elements Medium 25%
   295 Find Median from Data Stream Hard 37.5%
   658 Find K Closest Elements Medium 87.5%
4. Design / OOP
   ID Название Уровень Частота
   146 LRU Cache Medium 50%
   341 Flatten Nested List Iterator Medium 25%
   380 Insert Delete GetRandom O(1)    Medium 75%
   362 Design Hit Counter Medium 50%
   1656 Design an Ordered Stream Easy 25%
   2043 Simple Bank System Medium 25%
   2241 Design an ATM Machine Medium 62.5%
5. Bit Manipulation
   ID Название Уровень Частота
6. Math / Geometry
   ID Название Уровень Частота
   7 Reverse Integer Medium 37.5%
   9 Palindrome Number Easy 25%
   13 Roman to Integer Easy 25%
   415 Add Strings Easy 37.5%
   470 Implement Rand10()    Medium 25%
   356 Line Reflection Medium 75%
7. Greedy
   ID Название Уровень Частота
   605 Can Place Flowers Easy 37.5%
   849 Maximize Distance to Closest Person Medium 87.5%
   881 Boats to Save People Medium 25%
8. String / Array (простые манипуляции)
   ID Название Уровень Частота
   161 One Edit Distance Medium 75%
   228 Summary Ranges Easy 87.5%
   443 String Compression Medium 87.5%
   896 Monotonic Array Easy 50%
   1436 Destination City Easy 37.5%
   1496 Path Crossing Easy 37.5%
   2215 Find the Difference of Two Arrays Easy 25%
   2570 Merge Two 2D Arrays by Summing Values Easy 25%
   2657 Find the Prefix Common Array Medium 75%
   2743 Count Substrings Without Repeating Medium 50%
   2956 Find Common Elements Between Two Arrays Easy 25%
   3105 Longest Increasing/Decreasing Subarray Easy 75%

11. Union Find / Disjoint Set
    ID Название Уровень Частота
    200 Number of Islands Medium 75%
    Можно решать и через DFS, и через Union Find.

12. Two Pointers (дополнительные — уже есть в вашей теме, но не вошли)
    ID Название Уровень Частота
    680 Valid Palindrome II Easy 75%

---

Тема ID задач
Array 4, 33, 35, 53, 56, 74, 153, 200, 228, 238, 300, 322, 349, 350,
380, 485, 560, 605, 674, 849, 881, 896, 1868, 2215, 2570, 2956, 2006
Hash Table 205, 242, 349, 350, 380, 387, 438, 523, 560, 652, 771, 1436, 1656, 2043, 2215,
2657, 2956, 2006
String 5, 13, 17, 20, 22, 49, 68, 71, 76, 161, 205, 227, 242, 332, 340, 387, 395, 415, 424, 438, 443, 567,
680, 771
Sliding Window 76, 340, 395, 424, 438, 485, 487, 567, 1438, 2743, 2841
Two Pointers 19, 141, 234, 443, 567, 680, 881, 986
Binary Search 33, 35, 74, 153, 220, 300, 349, 350, 658
Linked List 2, 19, 21, 23, 24, 141, 146, 206, 234
Tree / DFS / BFS 98, 101, 102, 103, 110, 124, 199, 235, 236, 652, 938, 994, 1650
Stack / Queue 20, 22, 71, 146, 150, 155, 227, 232, 239, 341, 739, 933
Heap / Priority Queue 23, 239, 295, 347, 658
Math 7, 9, 13, 415, 470
Backtracking 17, 22
Dynamic Programming 53, 279, 300, 322, 674
Design 146, 155, 232, 341, 362, 380, 933, 1656, 2043, 2241, 2627, 2629, 2665, 2666, 2667
Sorting 56, 242, 347, 349, 350
Matrix 74, 1572
SQL 181
