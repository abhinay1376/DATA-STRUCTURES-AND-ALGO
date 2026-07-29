# 0005. Longest Palindromic Substring

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/longest-palindromic-substring/)  
**Submission Date:** 29 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
we go to every character and move outward to verify is it a palindrome or not if it is we store the maxlength as global variable and returns s.substring(start,start+maxlength) Treat each character (and each gap between two characters) as the center of a palindrome. Expand outward while the characters on both sides are equal. Whenever you find a longer palindrome than the current best, update its starting index and length.

### Lines / Logic To Be Careful With
global variables and private helper function expand

### Edge Cases Handled
if the string length 3 characters then it would definetely be a palindrome

## Solution

```java
class Solution {
     int start=0;
        int maxlength=0;
    public String longestPalindrome(String s) {
        if(s.length()<2)
        return s;
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start,start+maxlength);

        
    }
    private void expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            int curr_length=right-left+1;
            if(curr_length>maxlength){
                maxlength=curr_length;
                start=left;
            }
            left--;
            right++;
        }
    }
}
```
