# 0151. Reverse Words in a String

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-words-in-a-string/)  
**Submission Date:** 25 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
The string may contain:

Leading spaces
Trailing spaces
Multiple spaces between words

So first:

Remove leading and trailing spaces using trim().
Split the string into words using split("\\s+"), where \\s+ treats one or more spaces as a single separator.
Traverse the array from the end to the beginning.
Append each word to the answer, inserting a space between words.

### Lines / Logic To Be Careful With
String arr[]=s.split("\\s+");

### Edge Cases Handled
s=s.trim();
     String arr[]=s.split("\\s+");

## Solution

```java
class Solution {
    public String reverseWords(String s) {
           s=s.trim();
     String arr[]=s.split("\\s+");
     StringBuilder sb=new StringBuilder();
     for(int i=arr.length-1;i>=0;i--){
        if(i!=0){
            sb.append(arr[i]+' ');
        }
        else 
        sb.append(arr[i]);
     }
     return sb.toString();
    }
}
```
