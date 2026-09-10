# 3232. Find if Digit Game Can Be Won

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-if-digit-game-can-be-won/)  
**Submission Date:** 10 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
if the single digit sum and double digiit sum both are same then alice cannot win the game

### Lines / Logic To Be Careful With
num[i]/10 or nums[i] <10 both are same

### Edge Cases Handled
alllllllllllllllllllllllll

## Solution

```java
class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0;
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]/10==0) ssum+=nums[i];
            else 
            tsum+=nums[i];


        }
        if(tsum==ssum) return false;
        return true;

    }
}
```
