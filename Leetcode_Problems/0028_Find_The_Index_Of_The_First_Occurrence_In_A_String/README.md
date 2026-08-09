# 0028. Find the Index of the First Occurrence in a String

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)  
**Submission Date:** 9 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n*m) where n,m are lengths of the substrings  
**Space Complexity:** O(n) length of the substring  

## Revision Notes

### Intuition
We need to find the first position where needle appears inside haystack.

So check every possible starting position i.

At each position:

haystack.substring(i, i + needle.length())

takes exactly the same number of characters as needle.

Then:

.equals(needle)

checks whether they are identical.

If they match → return i.

If we check every possible position and never find a match → return -1.

Example
haystack = "sadbutsad"
needle   = "sad"
i = 0 → "sad" == "sad" ✅

Return:

0

### Lines / Logic To Be Careful With
for(int i=0;i<=haystack.length()-needle.length();i++){
             if(haystack.substring(i,i+needle.length()).equals(needle))
             return i;
          }

### Edge Cases Handled
all string1==string2 and also abc and c

## Solution

```java
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        if(haystack.contains(needle)){
            
          for(int i=0;i<=haystack.length()-needle.length();i++){
             if(haystack.substring(i,i+needle.length()).equals(needle))
             return i;
          }
        }
        return -1;
    }
}
```
