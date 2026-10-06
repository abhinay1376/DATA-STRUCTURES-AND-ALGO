# 0921. Minimum Add to Make Parentheses Valid

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)  
**Submission Date:** 6 Oct 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
'(' → push it because it needs a future ')'.
')' → if stack has '(', pop and form a valid pair.
Otherwise, push ')' because it needs an extra '('.
Whatever remains in the stack represents brackets that must be added.

### Lines / Logic To Be Careful With
st.peek() must only be called when the stack isn't empty.

### Edge Cases Handled
allllllllllllllllllllllll

## Solution

```java
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.size()!=0&&st.peek()=='('){
                st.pop();
                
                }
                else 
                st.push(s.charAt(i));
            }
            else
            st.push(s.charAt(i));
        }
        return st.size();
    }
}
```
