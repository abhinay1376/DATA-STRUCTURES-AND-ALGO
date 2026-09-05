# 0020. Valid Parentheses

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/valid-parentheses/)  
**Submission Date:** 5 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
A closing bracket must always match the most recently opened bracket.

Example:
{ [ ( ) ] }

The order of closing is the reverse of opening, so we use a Stack (LIFO).

Opening bracket → push
Closing bracket → check stack isn't empty → pop
Compare whether both brackets match
At the end → stack must be empty

### Lines / Logic To Be Careful With
if(st.isEmpty()) return false;

Handles cases like:

")"
"]"
"())"

Without this, pop() would cause an error.

return st.isEmpty();

Handles remaining unmatched opening brackets:

"("
"(["
"{[()]"

### Edge Cases Handled
Odd length → immediately invalid
Closing bracket appears before an opening bracket
Wrong bracket type: (]
Wrong nesting: ([)]
Extra opening brackets: ((
Empty string → valid

## Solution

```java
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if(st.isEmpty()) return false;
                char symb = st.pop();
                if (c == ')') {
                    if (symb != '(')
                        return false;
                } else if (c == '}') {
                    if (symb != '{')
                        return false;
                }
                if (c == ']') {
                    if (symb != '[')
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}
```
