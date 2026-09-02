# 0328. Odd Even Linked List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/odd-even-linked-list/)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Maintain two chains — one containing nodes at odd positions and one containing nodes at even positions. At the end, attach the even chain after the odd chain.

### Lines / Logic To Be Careful With
ListNode even=head.next;
        ListNode org=even;
        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=org;

### Edge Cases Handled
allllllllllllllllllll

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
    public ListNode oddEvenList(ListNode head) {
                if(head==null||head.next==null) return head;

        ListNode odd=head;
        ListNode even=head.next;
        ListNode org=even;
        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=org;
        return head;

    }
}
```
