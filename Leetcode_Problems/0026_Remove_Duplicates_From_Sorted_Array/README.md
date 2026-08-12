# 0026. Remove Duplicates from Sorted Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)  
**Submission Date:** 12 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using two pointer approach we can do this

### Lines / Logic To Be Careful With
returning the left +1

### Edge Cases Handled
allllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
           if(nums[left]==nums[right]){
            right++;
           }
           else{
            left++;
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right++;
           }
        }
        return left+1;
        
    }
}
```
