# 1528. None of the test cases are wrong. They're just confusing.

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/shuffle-string/)  
**Submission Date:** 28 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
indices[i] tells you where the current character s.charAt(i) should be placed. Since StringBuilder allows modifying characters at specific positions using setCharAt(), we first ensure it has enough length and then place each character at its destination.

### Lines / Logic To Be Careful With
decalring the s inside stringbuilder

### Edge Cases Handled
by using sb.setCharAt

## Solution

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder(s);
      for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}
```
