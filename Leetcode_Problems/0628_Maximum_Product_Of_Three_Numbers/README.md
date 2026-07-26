# 0628. Maximum Product of Three Numbers

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-of-three-numbers/)  
**Submission Date:** 26 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
The maximum product can only come from:

The three largest numbers, or
The largest number combined with the two smallest (most negative) numbers.

### Lines / Logic To Be Careful With
Instead of sorting the array, keep track of:

the three largest numbers seen so far, and
the two smallest numbers seen so far.

### Edge Cases Handled
By maintaining these five values in one pass, we avoid sorting.

## Solution

```java
class Solution {
    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max1){
            max3=max2;
            max2=max1;
            max1=nums[i];
        }
        else if(nums[i]>max2){
            max3=max2;
            max2=nums[i];
        }
        else if(nums[i]>max3){
            max3=nums[i];
        }
        if(nums[i]<min1){
            min2=min1;
            min1=nums[i];
        }
        else if(nums[i]<min2){
            min2=nums[i];
        }
       }

        return Math.max(max1 * max2 * max3,
                        max1 * min1 * min2);
    }
}
```
