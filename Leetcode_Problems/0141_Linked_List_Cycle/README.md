# 0141. Linked List Cycle

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Floyd's algorithm
slow and fast approaches if cycle exist they can reach at somepoint

### Lines / Logic To Be Careful With
fast=fast.next.next;
            slow=slow.next;
              if(fast==slow) return true; because we declare the slow and fast as head so the initial condition can become true so first we have to move them

### Edge Cases Handled
allllllllllllllllllllllllll

## Solution

```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         ListNode temp=head;
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null&&fast.next!=null){
          
            fast=fast.next.next;
            slow=slow.next;
              if(fast==slow) return true;
         }
         return false;

    } 
}
```
