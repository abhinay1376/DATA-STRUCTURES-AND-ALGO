# 0142. Linked List Cycle II

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle-ii/)  
**Submission Date:** 1 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
First meeting tells us a cycle exists.
Reset slow to head, then move both equally → their next meeting is the cycle start.

### Lines / Logic To Be Careful With
if(slow==fast){
              slow=head;
              while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
           
              }
              return slow;
            }
        }

### Edge Cases Handled
"Slow and fast meet, so that's the answer."

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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
              slow=head;
              while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
           
              }
              return slow;
            }
        }
        return null;
    }
}
```
