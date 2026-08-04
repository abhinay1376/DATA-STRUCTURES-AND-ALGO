# 3731. Find Missing Elements (LeetCode 3731) — Benchmark Report

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-missing-elements/)  
**Submission Date:** 4 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n × R), where R = large - small.  
**Space Complexity:** Auxiliary: O(1) Including output: O(k), where k is the number of missing elements.  

## Revision Notes

### Intuition
Intuition 💡
Sort the array.
Start from the smallest value.
Go until the largest value.
For every number in this range, check whether it exists in the array.
If it doesn't exist, add it to the answer.

### Lines / Logic To Be Careful With
using Arrays.sort it takes pivot quick sort and causes the memory limit exceded

### Edge Cases Handled
alllllllllllllllllll

## Solution

```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int small = Integer.MAX_VALUE;
int large = Integer.MIN_VALUE;

for(int num : nums){
    small = Math.min(small, num);
    large = Math.max(large, num);
}
        while(small<large){
            if(isthere(nums,small)){
                small++;
            }
            else {
            arr.add(small);
            small++;}
        }
        return arr;
    }
    static boolean isthere(int nums[],int small){
      int target=small;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return true;
        }
      }
      return false;

    }
}
```
