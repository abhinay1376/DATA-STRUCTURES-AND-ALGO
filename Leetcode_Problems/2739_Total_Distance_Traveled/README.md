# 2739. Total Distance Traveled

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/total-distance-traveled/)  
**Submission Date:** 31 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
We simply act like the truck is actually driving.

For:

mainTank = 9
additionalTank = 2

Initially:

Main = 9
Additional = 2

Consume one liter at a time:

Consumed 1 → Main = 8
Consumed 2 → Main = 7
Consumed 3 → Main = 6
Consumed 4 → Main = 5
Consumed 5 → Main = 4

Now 5 liters have been consumed:

Additional = 2
       ↓
Transfer 1L
       ↓
Main = 5
Additional = 1

Continue:

Consumed 5 more
Main = 0

Again, 5 liters consumed:

Additional = 1
       ↓
Transfer 1L
       ↓
Main = 1
Additional = 0

Finally consume that last 1 liter.

Total:

9 original liters
+ 2 transferred liters
= 11 liters

11 × 10 = 110 km

### Lines / Logic To Be Careful With
if (used == 5) {
                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
                used = 0;
            }

### Edge Cases Handled
alllllllllllllllllllll

## Solution

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int distance = 0;
        int used = 0;

        while (mainTank > 0) {

            mainTank--;
            used++;
            distance += 10;

            if (used == 5) {
                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
                used = 0;
            }
        }

        return distance;
    }
}
```
