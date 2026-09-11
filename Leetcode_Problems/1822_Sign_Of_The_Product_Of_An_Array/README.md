# 1822. Sign of the Product of an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/sign-of-the-product-of-an-array/)  
**Submission Date:** 11 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
The actual product can become extremely large, but we don't need to calculate it.
Only two things matter: whether a 0 exists and whether the number of negative values is odd or even.
Each negative number flips the sign of the product.

### Lines / Logic To Be Careful With
Don't actually multiply all numbers; overflow can happen.

### Edge Cases Handled
Contains 0, all positives, even negatives, odd negatives

## Solution

```java
class Solution {
    public int arraySign(int[] nums) {
         int n=0;
         int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            else if(nums[i]>0) p++;
            else n++;
        }
        if(n%2==0)
        return 1;
        return -1;
    }
}
```
