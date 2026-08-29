# 0875. Koko Eating Bananas

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/koko-eating-bananas/)  
**Submission Date:** 29 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(nlogn)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
binary search by answers

### Lines / Logic To Be Careful With
returning long to control the overflow in the helper unction

### Edge Cases Handled
allllllllllllllllll;

## Solution

```java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
            min = Math.min(min, piles[i]);
        }
        //     System.out.println(max+" "+min);
        int left = 1;
        int right = max;
        int ans = 0;
        while (left <= right) {
            int mid = left+(right - left) / 2;
            long time = banana(piles, mid);
           // System.out.println(mid+" "+time);

            if (time <= h) {
                ans = mid;
                right = mid - 1;
            } else if (time > h) {
                left = mid + 1;
            }
        }
        return ans;

    }

    static long banana(int[] nums, int t) {
        long hours = 0;
        for (int i = 0; i < nums.length; i++) {
            hours += (int) Math.ceil((double) nums[i] / t);
        }

        return hours;
    }
}
```
