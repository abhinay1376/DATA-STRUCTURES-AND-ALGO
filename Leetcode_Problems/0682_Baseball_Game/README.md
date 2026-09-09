# 0682. Baseball Game

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/baseball-game/)  
**Submission Date:** 9 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Intuition Summary
The stack stores all valid baseball scores.
"C" removes the previous score.
"D" adds double the previous score.
"+" adds the sum of the previous two scores.
Finally, sum everything remaining in the stack.

### Lines / Logic To Be Careful With
int c=st.pop();
              int d=st.pop();
              int e=c+d;
                            st.push(d);

              st.push(c);

### Edge Cases Handled
(operations[i].equals("C"),,,Integer.parseInt(operations[i]

## Solution

```java
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
              if(st.size()>=2){
              int c=st.pop();
              int d=st.pop();
              int e=c+d;
                            st.push(d);

              st.push(c);
              st.push(e);
              }
            }
            else if(operations[i].equals("D")){
               st.push(2*st.peek());
            }
             else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
```
