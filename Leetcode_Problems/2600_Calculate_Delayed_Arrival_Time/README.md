# 2600. Calculate Delayed Arrival Time

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/calculate-delayed-arrival-time/)  
**Submission Date:** 23 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
basic approach using the question details

### Lines / Logic To Be Careful With
return arrivalTime+delayedTime<24?arrivalTime+delayedTime:(arrivalTime+delayedTime)%24;

### Edge Cases Handled
alllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return arrivalTime+delayedTime<24?arrivalTime+delayedTime:(arrivalTime+delayedTime)%24;
    }
}
```
