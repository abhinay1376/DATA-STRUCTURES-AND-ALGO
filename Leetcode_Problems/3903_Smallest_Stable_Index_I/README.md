# 3903. Smallest Stable Index I

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-stable-index-i/)  
**Submission Date:** 4 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
i divides the array into a left part and a right part. Keep the biggest value seen on the left using max, then scan the right side to find its smallest value using min. If max - min <= k, that i is stable. Since we check i from left to right, the first one is the smallest stable index.

### Lines / Logic To Be Careful With
<= k, use j inside the while, and return -1 if no index works.

### Edge Cases Handled
nums = [0], k = 0 → 0; no stable index → -1.

## Solution

```java
class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(nums[i], max);

            int min = Integer.MAX_VALUE;
            int j = i;

            while (j < nums.length) {
                min = Math.min(min, nums[j]);
                j++;
            }

            int s = max - min;

            if (s <= k)
                return i;
        }

        return -1;
    }
}
```
