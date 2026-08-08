# 0058. Length of Last Word

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/length-of-last-word/)  
**Submission Date:** 8 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Keep counting the current word. Whenever a space appears, reset the count. Keep the latest word length in max. At the end, max is the last word's length.

### Lines / Logic To Be Careful With
max=count;;;;;;;;;;;;;;;;;;;;;;

### Edge Cases Handled
like the words even ended with the space

## Solution

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
                max=count;
            }
            else {
                count=0;
            }
            
        }
        return max;
    }
}
```
