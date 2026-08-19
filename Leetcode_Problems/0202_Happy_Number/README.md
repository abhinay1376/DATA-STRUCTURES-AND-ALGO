# 0202. Why the input number cannot go to infinity (an explanation/proof that fits the context of a technical interview)

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/happy-number/)  
**Submission Date:** 19 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(log₁₀ n) (One iteration per digit.)  
**Space Complexity:** O(log n)  

## Revision Notes

### Intuition
A happy number repeatedly replaces the number with the sum of squares of its digits.

If we reach 1 → Happy Number → true
If a number repeats → we are stuck in a cycle → false

We use a HashSet to store previously seen numbers and detect a cycle.

### Lines / Logic To Be Careful With
O(log n × k)

More simply for interview purposes: O(log n) per transformation, and the sequence quickly reaches a small bounded range.

### Edge Cases Handled
alllllllllll;;;;;;;;;;;;;;;;;;;;

## Solution

```java
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map=new HashSet<>();
        int sum1=sum(n);
        while(sum1!=1){
            if(map.contains(sum1))
            return false;
                        map.add(sum1);

            sum1=sum(sum1);

        }
        return true;
        
      
    }
    static int sum(int n){
        int sum=0;
          while(n!=0){
            int digit=n%10;

            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}
```
