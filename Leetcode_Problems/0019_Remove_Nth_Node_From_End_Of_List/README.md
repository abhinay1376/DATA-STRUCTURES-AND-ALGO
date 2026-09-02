# 0019. Remove Nth Node From End of List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Using your two-pass approach:

Traverse the list and find its length count.

If count == n, the node to remove is the head:

return head.next;
Otherwise, find the node before the target.

Delete the target using:

temp.next = temp.next.next;
🔑 Formula
Target position from beginning = count - n + 1
Previous node position         = count - n

### Lines / Logic To Be Careful With
if (count == n) {
            return head.next;
        }
        int c = 1;
        temp = head;
        while (c<count-n) {
            
            c++;

            temp = temp.next;
        }
        temp.next=temp.next.next;

### Edge Cases Handled
Forgot to reset temp = head after the first traversal.
Changed temp instead of changing head when removing the first node.
Changed head but didn't return, so the remaining code executed.
Started c incorrectly, causing count - n = 0 cases to fail.

Confused:

temp.next.next == null

with:

temp.next == null

The first is safe; the second can cause NullPointerException.

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
        ListNode temp = head;
        if (n == 1 && head.next == null)
            return null;

        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            return head.next;
        }
        int c = 1;
        temp = head;
        while (c<count-n) {
            
            c++;

            temp = temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}
```
