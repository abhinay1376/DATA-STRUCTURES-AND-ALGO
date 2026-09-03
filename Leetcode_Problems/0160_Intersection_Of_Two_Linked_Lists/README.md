# 0160. Intersection of Two Linked Lists

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/intersection-of-two-linked-lists/)  
**Submission Date:** 3 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(m+n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Don't memorize the whole code. Remember these 3 ideas:

1. Two pointers
       ↓
2. A → B
   B → A
       ↓
3. Meet at same node

And the final formula:

A + B = B + A

That's why the two-pointer approach achieves:

### Lines / Logic To Be Careful With
1. Start both pointers
ListNode temp1 = headA;
ListNode temp2 = headB;
2. Move + switch lists
temp1 = (temp1 == null) ? headB : temp1.next;
temp2 = (temp2 == null) ? headA : temp2.next;

This is the main trick.

Meaning:

If pointer reaches END
        ↓
send it to OTHER list
temp1: A → END → B
temp2: B → END → A
3. Stop when they are the same node
while (temp1 != temp2)

Important: Don't use:

temp1.val != temp2.val ❌

because we need the same node, not the same value.

### Edge Cases Handled
1. Both lists have an intersection
A: 1 → 2 → 7 → 8
B: 3 → 7 → 8
         ↑
     intersection

Pointers meet at 7 → return 7.

2. No intersection
A: 1 → 2 → 3 → null

B: 4 → 5 → 6 → null

Eventually:

temp1 = null
temp2 = null

So:

temp1 == temp2

and null is returned.

3. One list is empty
A: null

B: 1 → 2 → 3

The pointers eventually both become null.

Result: null.

4. Both lists are empty
A: null
B: null

Initially:

temp1 == temp2

so the loop doesn't execute.

return temp1;

returns null.

5. Intersection is the first node
A: ─────→ 7 → 8
          ↑
B: ──────┘

Initially:

temp1 == temp2

so it immediately returns that node.

6. The two lists are exactly the same
A: 1 → 2 → 3
   ↑
B: 1 → 2 → 3

temp1 and temp2 start at the same node, so the answer is immediately headA.

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
       ListNode temp1=headA;
       ListNode temp2=headB;
        while(temp1!=temp2){
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
           
        }
        return temp2;
      
    }
}
```
