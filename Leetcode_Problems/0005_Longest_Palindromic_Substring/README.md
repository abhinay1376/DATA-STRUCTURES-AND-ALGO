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
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
we check every substring from the longest onwards and if it is a palindrome and its length is greater than previous ans then only we can add it

### Lines / Logic To Be Careful With
when j is starting from s.length it can be only comes upto j>i

### Edge Cases Handled
by coming from longest

## Solution

```java
class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                String sub=s.substring(i,j);
                if(ispalindrome(sub)&&sub.length()>ans.length())
                  {
                   ans=sub;
                    }
                  }

            }
            return ans;

        }
    static boolean ispalindrome(String s){
     int left=0;
     int right=s.length()-1;
     while(left<right){
        if(s.charAt(left)!=s.charAt(right))
        return false;
        else
        left++;
        right--;
     }
     return true;
    }
}
```
