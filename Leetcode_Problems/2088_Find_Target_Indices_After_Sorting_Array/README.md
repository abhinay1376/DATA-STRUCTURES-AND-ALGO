# 2088. Find Target Indices After Sorting Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-target-indices-after-sorting-array/)  
**Submission Date:** 23 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(nlogn)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
sorting the arr first and if target equal to nums[i] we add that index to the list

### Lines / Logic To Be Careful With
arrays.sort();;;;;;;;;;;;;;;;;

### Edge Cases Handled
allllllllllllllllllllllllll

## Solution

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            list.add(i);
        }
        return list;
    }
}
```
