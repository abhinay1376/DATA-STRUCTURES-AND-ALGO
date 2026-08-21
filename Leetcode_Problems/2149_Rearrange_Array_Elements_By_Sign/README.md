# 2149. Rearrange Array Elements by Sign

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/rearrange-array-elements-by-sign/)  
**Submission Date:** 21 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
The problem requires the final array to follow:

Positive, Negative, Positive, Negative...

Instead of first separating positives and negatives, we can directly place each number in its correct position.

Even indexes → positive numbers
Odd indexes → negative numbers

Because the problem guarantees an equal number of positive and negative elements, both pointers will fit perfectly inside the array

### Lines / Logic To Be Careful With
every lineeeeeeeeeeeeeeeeeeeeee

### Edge Cases Handled
alllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int left=0;
        int right=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[left]=nums[i];
                left+=2;
            }
            else{
                arr[right]=nums[i];
                right+=2;
            }
        }
        return arr;
    }
}
```
