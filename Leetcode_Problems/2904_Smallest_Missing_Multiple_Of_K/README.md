# 2904. Smallest Missing Multiple of K

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-missing-multiple-of-k/)  
**Submission Date:** 26 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(m+n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Think of k as the base number. Don't modify the base.

Instead, increase the multiplier:

k × 1
k × 2
k × 3
k × 4

The first multiple not present in the HashSet is the answer.

### Lines / Logic To Be Careful With
k*n returning impppppp

### Edge Cases Handled
alllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
         int n=1;
        while(set.contains(k*n)){
            n++;
        }
        return k*n;
    }
}
```
