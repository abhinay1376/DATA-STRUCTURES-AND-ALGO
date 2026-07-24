# 1614. Maximum Nesting Depth of the Parentheses

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)  
**Submission Date:** 24 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
so will maintain a count of opening parenthesis and then storing max of it and again if we get closing parenthesis we just reduce the count and return the max count

### Lines / Logic To Be Careful With
using else if because numbers will be also considered and count will decrease

### Edge Cases Handled
starting the count and max at 0

## Solution

```java
class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                max=Math.max(count,max);
            }
            else if(s.charAt(i)==')')
             count--;
            
        }
        return max;
    }
}
```
