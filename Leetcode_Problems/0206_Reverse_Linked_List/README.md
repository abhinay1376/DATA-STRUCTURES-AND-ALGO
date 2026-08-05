# 0206. Reverse Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-linked-list/)  
**Submission Date:** 5 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Think of the linked list as a chain of arrows:

1 → 2 → 3 → 4 → 5

Our goal is to make every arrow point backward:

1 ← 2 ← 3 ← 4 ← 5

At every step:

Save the next node (next) so you don't lose the rest of the list.
Reverse the current node's pointer (curr.next = prev).
Move prev and curr one step forward.

Repeat until curr becomes null. At that point, prev is the new head.

### Lines / Logic To Be Careful With
listnode spelling...............

### Edge Cases Handled
alllllllllllllllllllll

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.next = next; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;         
            prev = curr;             
            curr = next;             
        }

        return prev;
    }
}
```
