# 1781. Sum of Beauty of All Substrings

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/sum-of-beauty-of-all-substrings/)  
**Submission Date:** 30 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^3)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
this is brute force approach where we do it for every substring

### Lines / Logic To Be Careful With
hashmap is empty then no min and no max

### Edge Cases Handled
for empty substrings and j=i+1

## Solution

```java
class Solution {
    public int beautySum(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String t = s.substring(i, j);

                sum += beauty(t);
            }
        }

        return sum;
    }

    static int beauty(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max = Collections.max(map.values());
        int min = Collections.min(map.values());

        return max - min;
    }
}
```
