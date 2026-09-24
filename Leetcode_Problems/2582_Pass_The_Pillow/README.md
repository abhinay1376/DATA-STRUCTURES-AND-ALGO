# 2582. Pass the Pillow

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/pass-the-pillow/)  
**Submission Date:** 24 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
by using the number of turns and direction

### Lines / Logic To Be Careful With
int turns=time/(n-1);
       int rem=time%(n-1);
       if(turns%2==0)
       return rem+1;
       return n-rem;

### Edge Cases Handled
int turns=time/(n-1);
       int rem=time%(n-1);
       if(turns%2==0)
       return rem+1;
       return n-rem;

## Solution

```java
class Solution {
    public int passThePillow(int n, int time) {
       int turns=time/(n-1);
       int rem=time%(n-1);
       if(turns%2==0)
       return rem+1;
       return n-rem;

       
    }
}
```
