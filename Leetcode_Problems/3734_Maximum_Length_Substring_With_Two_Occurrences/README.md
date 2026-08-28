# 3734. Maximum Length Substring With Two Occurrences

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)  
**Submission Date:** 28 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(k), where k is the number of distinct characters. Here, since only lowercase English letters exist, at most 26, effectively O(1).  

## Revision Notes

### Intuition
Imagine you have a valid window:

b c b b

Counts:

b = 3 ❌
c = 1

The rule breaks because of b. So move left forward until one b is removed and:

b = 2 ✅

Then continue expanding.

### Lines / Logic To Be Careful With
returning the maximum length +1

### Edge Cases Handled
ALLLLLLLLLLLLLLLLLLl

## Solution

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 2) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
```
