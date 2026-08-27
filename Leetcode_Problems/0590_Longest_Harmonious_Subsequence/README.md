# 0590. Longest Harmonious Subsequence

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/longest-harmonious-subsequence/)  
**Submission Date:** 27 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
For every number num, we check:

Is num + 1 present?

If yes:

frequency(num) + frequency(num + 1)

Because a harmonious subsequence can contain only those two values.

### Lines / Logic To Be Careful With
everyline                 nnnnnnnnnnnnnnnn

### Edge Cases Handled
alllllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                max = Math.max(max, map.get(num) + map.get(num + 1));
            }
        }

        return max;
    }
}
```
