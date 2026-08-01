# 4006. Count Valid Prefixes

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-valid-prefixes/)  
**Submission Date:** 1 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Traverse the string from left to right while maintaining the counts of '0' and '1' in the current prefix. After processing each character, check if the absolute difference between the counts is at most 1. If it is, that prefix can be rearranged into an alternating string, so increment the answer.

### Lines / Logic To Be Careful With
<=1 condition in the math.abs

### Edge Cases Handled
alllllllllllllllllllel

## Solution

```java
class Solution {
    public int countValidPrefixes(String s) {        
       int ans=0;
        int count=0;
        int count1=0;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='0') count++;
              else count1++;
              if(Math.abs(count1-count)<=1)
                  ans++;
          }

     return ans;
    }
}
```
