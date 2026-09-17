# 1477. Rotate String

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/rotate-string/)  
**Submission Date:** 17 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
A rotation means we cut s at some position and swap the two parts.
Example: "abcde" → "cdeab".
If we concatenate s + s → "abcdeabcde", every possible rotation appears inside it.
So, if goal is a substring of s+s, it is a valid rotation.

### Lines / Logic To Be Careful With
First check s.length() != goal.length() → rotations must have the same length.
s+s is necessary; checking s.contains(goal) directly would be wrong.
Empty strings: Java's contains("") is true, so this still works correctly.

### Edge Cases Handled
if(s.length()!=goal.length())
        return false;

## Solution

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        s=s+s;
        if(s.contains(goal))
        return true;
        else 
        return false;    }
}
```
