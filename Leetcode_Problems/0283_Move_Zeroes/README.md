# 0283. Move Zeroes

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/move-zeroes/)  
**Submission Date:** 3 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using two pointer approach we use right to iterate and left stays and non zero and  increments only when swapped

### Lines / Logic To Be Careful With
while condition and left and right initailisation

### Edge Cases Handled
alllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
        if(nums[right]!=0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
        }
        right++;
        }
    }
}
```
