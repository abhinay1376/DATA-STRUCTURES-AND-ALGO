# 2582. Pass the Pillow

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/pass-the-pillow/)  
**Submission Date:** 21 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(time)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
by following the givien process in the question

### Lines / Logic To Be Careful With
if(ans%n==0){
            while(ans!=1&&time!=0){

### Edge Cases Handled
alllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int passThePillow(int n, int time) {
             int ans=1;
     while(time!=0){
        ans++;
        time--;
        if(ans%n==0){
            while(ans!=1&&time!=0){
               ans--;
               time--;
            }
        }
     }
     return ans;
    }
}
```
