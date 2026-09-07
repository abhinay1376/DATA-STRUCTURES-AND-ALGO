# 1929. Concatenation of Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/concatenation-of-array/)  
**Submission Date:** 7 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Create a new array with twice the original length. For every element in nums, place it once at its original index and again at the same index shifted by nums.length. This directly creates nums + nums.

### Lines / Logic To Be Careful With
arr[i+nums.length]=nums[i];

### Edge Cases Handled
Empty array and single-element array.

## Solution

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] arr=new int[n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
      
        return arr;

    }
}
```
