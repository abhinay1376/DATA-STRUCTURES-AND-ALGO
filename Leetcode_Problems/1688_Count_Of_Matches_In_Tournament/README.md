# 1688. Count of Matches in Tournament

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-of-matches-in-tournament/)  
**Submission Date:** 21 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(nlogn)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
using the given approach for it

### Lines / Logic To Be Careful With
allllllllllllllllllllllllllllll

### Edge Cases Handled
allllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n!=1){
          if(n%2==0){
            sum+=n/2;
            n=n/2;
          }
          else{
            sum+=n/2;
            n=n/2+1;
          }
        }
        return sum;
        
    }
}
```
