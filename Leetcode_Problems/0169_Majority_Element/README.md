# 0169. Majority Element

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/majority-element/)  
**Submission Date:** 18 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Boyer morre voting algo Majority element can survive cancellation.
Pair every majority element with a different element → because majority elements are more than all others combined, at least one majority element remains.

### Lines / Logic To Be Careful With
if and else conditional statements

### Edge Cases Handled
allllllllllllllllllll

## Solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ma=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ma=nums[i];
                count++;

            }
            else if(nums[i]==ma){
                count++;
            }
            else 
            count--;
        }
        return ma;
    }
}
```
