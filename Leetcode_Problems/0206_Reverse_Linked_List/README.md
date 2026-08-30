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
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
we store the linked list in an arraylist and reverse them and creates a new linked list

### Lines / Logic To Be Careful With
}
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;
        for(int i=arr.size()-1;i>=0;i--){
         ListNode node = new ListNode(arr.get(i));  
                  temp1.next=node;    

         temp1=temp1.next;   

        }
        return dummy.next;

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
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;
        for(int i=arr.size()-1;i>=0;i--){
         ListNode node = new ListNode(arr.get(i));  
                  temp1.next=node;    

         temp1=temp1.next;   

        }
        return dummy.next;
    }
}
```
