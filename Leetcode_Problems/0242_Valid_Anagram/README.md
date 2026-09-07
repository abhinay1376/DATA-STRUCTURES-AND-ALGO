# 0242. Valid Anagram

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/valid-anagram/)  
**Submission Date:** 7 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Add the frequency of characters from s and subtract the frequency of characters from t. If both strings contain exactly the same characters with the same frequencies, every count will finally become 0.

### Lines / Logic To Be Careful With
map and map1 names and also s and t

### Edge Cases Handled
Always check s.length() != t.length() first.

## Solution

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
             for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map);
    }
}
```
