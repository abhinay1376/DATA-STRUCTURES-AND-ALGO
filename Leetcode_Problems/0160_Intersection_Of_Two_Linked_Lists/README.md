# 0160. Intersection of Two Linked Lists

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/intersection-of-two-linked-lists/)  
**Submission Date:** 3 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(m + n)  
**Space Complexity:** O(m + n)  

## Revision Notes

### Intuition
Why are you traversing both at the same time?

This part:

while (temp1 != null || temp2 != null)

allows you to continue until both lists have been completely traversed.

Inside the loop:

if (temp1 != null)

handles list A.

And:

if (temp2 != null)

handles list B.

So even if one list finishes earlier, the other one continues.

### Lines / Logic To Be Careful With
while(temp1!=null||temp2!=null){

### Edge Cases Handled
alllllllllllllllllllllllllllll

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
       ListNode temp1=headA;
       ListNode temp2=headB;
       while(temp1!=null||temp2!=null){
        if(temp1!=null){
            if(set.contains(temp1))
            return temp1;
            else 
            {
                set.add(temp1);
            temp1=temp1.next;

        }
        }
           if(temp2!=null){
            if(set.contains(temp2))
            return temp2;
            else 
            {
                set.add(temp2);
            temp2=temp2.next;

        }
        }
       }
       return null;

    }
}
```
