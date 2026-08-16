# 0075. Sort Colors

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/sort-colors/)  
**Submission Date:** 16 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using the dutch national flag algrorithm

### Lines / Logic To Be Careful With
mid<=right,and else if condition

### Edge Cases Handled
allllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(mid<=right){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                mid++;
                left++;
            }
            else if(nums[mid]==2){
                 int temp=nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
            }
            else 
             mid++;
        }
    }
}
```
