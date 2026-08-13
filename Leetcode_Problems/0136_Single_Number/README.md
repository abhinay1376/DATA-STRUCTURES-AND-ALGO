# 0136. Single Number

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/single-number/)  
**Submission Date:** 13 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using xor logic we can do this

### Lines / Logic To Be Careful With
xor=0;;;;;;;;;;;;;;;;;;

### Edge Cases Handled
alllllllllllllllllll

## Solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
             xor^=nums[i];
        }
        return xor;
    }
}
```
