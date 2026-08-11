# 1752. Check if Array Is Sorted and Rotated

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)  
**Submission Date:** 11 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using count variable if the array is sorted or rotated we can say only if :- if the array is sorted then last element is greater than first so count increments to 1 and if the array is sorted then at a place it increments to  1

### Lines / Logic To Be Careful With
if condition outside the loop

### Edge Cases Handled
alllllllllll 6 10 6 11111111111

## Solution

```java
class Solution {
    public boolean check(int[] nums) {
        int count=0;
   
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
             if(nums[nums.length-1]>nums[0])
 count++;
        if(count<=1) return true;
        return false;
        
    }
}
```
