# Count Substrings with a, b and c

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/count-substring/1)  
**Submission Date:** 31 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
so storing every substring and checking brute force approach

### Lines / Logic To Be Careful With
j<=s.length();///////////////

### Edge Cases Handled
allllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public static int countSubstring(String s) {
        // code here
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String t=s.substring(i,j);
                if(t.contains("a") && t.contains("b") && t.contains("c")){
                    count++;
                }
            }
        }
        return count;
    }
}
```
