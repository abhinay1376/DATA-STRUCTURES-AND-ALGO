# 0206. Reverse Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-linked-list/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
The key idea is:

Take the current node and make it point backward.

Suppose:

1 → 2 → 3 → null

Initially:

prev = null
temp = 1
Step 1

Save where you're going:

next = temp.next;
1 → 2 → 3
    ↑
   next

Reverse the arrow:

temp.next = prev;
1 → null

Then move both pointers:

prev = temp;
temp = next;

Now:

prev    temp
 ↓       ↓
1  →    2 → 3 → null
Step 2

Again:

prev     temp
 ↓        ↓
1 ← 2    3 → null
Step 3
prev          temp
 ↓             ↓
1 ← 2 ← 3    null

Finally:

return prev;

So:

3 → 2 → 1 → null

### Lines / Logic To Be Careful With
next = temp.next;  // save forward direction
temp.next = prev;  // reverse direction
prev = temp;       // move prev
temp = next;       // move temp

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
 *     ListNode(int val, ListNode next) { this.next = next; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode temp=head;
      ListNode prev=null;
      while(temp!=null){
        ListNode next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;

      }
      return prev;
    }
}
```
