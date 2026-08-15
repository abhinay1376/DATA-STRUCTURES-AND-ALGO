# 0001. Two Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/two-sum/)  
**Submission Date:** 15 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
iterating through entire array

### Lines / Logic To Be Careful With
j=i+1 in the inner loop

### Edge Cases Handled
duplicate array value ones

## Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                   arr[0]=i;
                   arr[1]=j;
                   return arr;
                }
            }
        }
        return arr;
    }
}
```
