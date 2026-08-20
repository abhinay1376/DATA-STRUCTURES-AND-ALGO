# 0053. Maximum Subarray

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-subarray/)  
**Submission Date:** 20 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
kadanes algorithm to find max

### Lines / Logic To Be Careful With
max=Integer minimum value

### Edge Cases Handled
alllllllllllllllllll;

## Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;

        }
        return max;
    }
}
```
