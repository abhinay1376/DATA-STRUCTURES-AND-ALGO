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
intialising the max with 0

### Edge Cases Handled
this works only for positive numbers

## Solution

```java
class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int max1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max1=max;
                max=i;
            }
            else if(nums[i]>nums[max1]){
                max1=i;
            }
        }
        return (nums[max]-1)*(nums[max1]-1);
    }
}
```
