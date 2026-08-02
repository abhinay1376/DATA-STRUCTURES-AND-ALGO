# 0008. String to Integer (atoi)

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/string-to-integer-atoi/)  
**Submission Date:** 3 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Traverse the string once. Ignore leading spaces, determine the sign, and then convert consecutive digits into an integer. Before adding each digit, verify that multiplying the current number by 10 and adding the new digit will not overflow the 32-bit signed integer range. Stop parsing when a non-digit character is encountered and return the signed result

### Lines / Logic To Be Careful With
while condition is character is digit

### Edge Cases Handled
only when non digit character comes

## Solution

```java
class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ')
            i++;

        if (i == n)
            return 0;

        int sign = 1;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (num > Integer.MAX_VALUE / 10 ||
               (num == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }
}
```
