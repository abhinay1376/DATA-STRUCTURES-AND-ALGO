# 0007. Reverse Integer

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-integer/)  
**Submission Date:** 7 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(log₁₀ n) (One iteration per digit.)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
reverse all the digits

### Lines / Logic To Be Careful With
if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
            }

### Edge Cases Handled
long usage and type casting error

## Solution

```java
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int digit=x%10;
        
       
            rev=rev*10+digit;
            x/=10;
        }    if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
            }

        return (int)rev;
    }
}
```
