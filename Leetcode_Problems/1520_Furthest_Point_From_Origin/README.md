# 1520. Furthest Point From Origin

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/furthest-point-from-origin/)  
**Submission Date:** 18 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
L = 5
R = 2
_ = 3

Current net position:

5 L's cancel 2 R's
remaining = 3 left

So distance without _ = 3.

All 3 _ can become L, giving:

3 + 3 = 6

Hence:

|L - R| + _

### Lines / Logic To Be Careful With
returning distance and intution

### Edge Cases Handled
your moves.replace('_', m) idea itself is valid for choosing a direction; the problem is that after replacing them, you should calculate net displacement

## Solution

```java
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        if(moves.length()==1) return 1;
        int countL=0;
        int countR=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') countL++;
            if(moves.charAt(i)=='R') countR++;
        }
       int emp=moves.length()-(countL+countR);
        
      int distance = Math.abs(countR - countL) + emp;
      return distance;
    }
}
```
