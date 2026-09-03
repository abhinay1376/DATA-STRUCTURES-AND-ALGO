# 0019. Remove Nth Node From End of List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)  
**Submission Date:** 3 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
fast = n+1 steps ahead
        ↓
move both together
        ↓
fast reaches null
        ↓
slow is BEFORE the node to delete
        ↓
slow.next = slow.next.next

### Lines / Logic To Be Careful With
slow.next=slow.next.next;
        return dummy.next;

### Edge Cases Handled
Whenever you use a dummy node in linked-list problems, the final head is usually dummy.next, not the original head.

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;


    }
}
```
