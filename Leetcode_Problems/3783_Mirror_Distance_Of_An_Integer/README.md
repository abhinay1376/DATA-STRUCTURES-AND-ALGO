# 3783. Mirror Distance of an Integer

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/mirror-distance-of-an-integer/)  
**Submission Date:** 12 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(logn)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Store the original number in org.
Reverse the digits of n.
rev * 10 + digit builds the reversed number.
The mirror distance is simply |original - reversed|.

### Lines / Logic To Be Careful With
storing the orginal value

### Edge Cases Handled
alllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;

        }
        return Math.abs(org-rev);
    }
}
```
