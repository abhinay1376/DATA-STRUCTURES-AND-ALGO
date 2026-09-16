# 1621. Sum of Distances

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/sum-of-distances/)  
**Submission Date:** 16 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
For every number, we need the distance from its index to all other same numbers.
Instead of checking every index, scan left → right and calculate the contribution from same numbers on the left.
Then scan right → left to calculate the contribution from same numbers on the right.
count stores how many same numbers we've seen, and sum stores their index sum.
Formula: currentIndex × count - sum gives the total left-side distance

### Lines / Logic To Be Careful With
Use long because the total distance can exceed int

### Edge Cases Handled
all same, all unique, single element, large arrays.

## Solution

```java
class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        HashMap<Integer, Long> count = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();
        for (int i = 0; i < n; i++) {

            int x = nums[i];

            long c = count.getOrDefault(x, 0L);
            long s = sum.getOrDefault(x, 0L);

            ans[i] += (long) i * c - s;

            count.put(x, c + 1);
            sum.put(x, s + i);
        }
        count.clear();
        sum.clear();
        for (int i = n - 1; i >= 0; i--) {

            int x = nums[i];

            long c = count.getOrDefault(x, 0L);
            long s = sum.getOrDefault(x, 0L);

            ans[i] += s - (long) i * c;

            count.put(x, c + 1);
            sum.put(x, s + i);
        }

        return ans;
    }
}
```
