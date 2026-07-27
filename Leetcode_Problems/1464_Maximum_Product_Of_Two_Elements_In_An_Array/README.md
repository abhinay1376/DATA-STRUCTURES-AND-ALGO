# 1464. Maximum Product of Two Elements in an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)  
**Submission Date:** 27 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
The answer depends only on the two largest numbers in the array. Instead of sorting, keep track of the largest and second-largest values while traversing the array once. Whenever a new maximum is found, shift the old maximum to second maximum.

### Lines / Logic To Be Careful With
initialsing the max variables carefully

### Edge Cases Handled
this works only for the positive numbers without duplicates

## Solution

```java
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max1=max;
                max=nums[i];
            }
            else if(nums[i]>max1){
                max1=nums[i];
            }
        }
        return (max-1)*(max1-1);
    }
}
```
