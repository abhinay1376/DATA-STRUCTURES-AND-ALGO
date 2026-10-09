# 3498. Reverse Degree of a String

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-degree-of-a-string/)  
**Submission Date:** 9 Oct 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
checking each value of character by subtraacting from the 122 asquii value of the z

### Lines / Logic To Be Careful With
alllllllllllllllll;lll

### Edge Cases Handled
//a - 97 =26 -61
//122-z=1     -121
//98-b=25       -63
//99 -c =24      -65

## Solution

```java
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=(int)s.charAt(i);
            sum+=(i+1)*(122-x+1);
        }
        return sum;
    }
}
//a - 97 =26 -61
//122-z=1     -121
//98-b=25       -63
//99 -c =24      -65
```
