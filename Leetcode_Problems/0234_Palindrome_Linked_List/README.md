# 0234. Palindrome Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/palindrome-linked-list/)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
by using the middle of linkedlist and reverse of that reverse we get to know whether the linkedlist given is palindrome or not

### Lines / Logic To Be Careful With
while(temp!=revers&&temp!=null&&revers!=null){
            if(temp.val!=revers.val) return false;
            temp=temp.next;
            revers=revers.next;

        }

### Edge Cases Handled
allllllllllllllllllllllllll

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode middl=middle(head);
        ListNode revers=reverse(middl);
        while(temp!=revers&&temp!=null&&revers!=null){
            if(temp.val!=revers.val) return false;
            temp=temp.next;
            revers=revers.next;

        }
        return true;
    }
    static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            

        }
        return slow;

    }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode nestt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nestt;
        }
        return prev;
    }
}
```
