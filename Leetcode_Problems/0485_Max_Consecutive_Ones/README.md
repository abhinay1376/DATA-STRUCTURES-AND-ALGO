# 0485. Max Consecutive Ones

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/max-consecutive-ones/)  
**Submission Date:** 10 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using count and max vairable

### Lines / Logic To Be Careful With
max assigning in the loop

### Edge Cases Handled
110111111111111111111111111111

## Solution

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 count++;
                 max=Math.max(max,count);
            }
            else 
            count=0;


        }
        return max;
    }
}
```
