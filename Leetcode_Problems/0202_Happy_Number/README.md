# 0202. Why the input number cannot go to infinity (an explanation/proof that fits the context of a technical interview)

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/happy-number/)  
**Submission Date:** 28 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(logn)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
slow moves 1 step, fast moves 2 steps.
Happy number → sequence eventually reaches 1.
Unhappy number → sequence enters a cycle, so slow == fast.
Since the while stops when slow reaches 1, meeting before that means cycle → false.

### Lines / Logic To Be Careful With
while(sum(slow)!=1){
       
            slow=sum(slow);
            fast=sum(sum(fast));
            if(slow==fast){
            return false;
        }

### Edge Cases Handled
alllllllllllllllllllll

## Solution

```java
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(sum(slow)!=1){
       
            slow=sum(slow);
            fast=sum(sum(fast));
            if(slow==fast&&sum(slow)!=1){
            return false;
        }
            if(slow==fast&&sum(slow)==1){
            return true;
            }

        }
        return true;

    }
      static int sum(int n){
            int s=0;
        while(n!=0){
            int digit=n%10;
            s+=digit*digit;
            n/=10;
        }
        return s;
    }
}
```
