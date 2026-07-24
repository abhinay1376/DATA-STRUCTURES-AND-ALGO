# 0013. Roman to Integer

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/roman-to-integer/)  
**Submission Date:** 24 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Roman numerals are usually added together, but there is one special rule:

If a smaller value appears before a larger value, it should be subtracted instead of added.

Examples:

VI = 5 + 1 = 6
IV = 5 - 1 = 4
IX = 10 - 1 = 9

To identify whether a numeral should be added or subtracted efficiently, we traverse the string from right to left.

Keep track of the previous (right-side) numeral value.
If the current value is less than the previous value, subtract it because it forms a subtractive pair.
Otherwise, add it to the answer.
Update the previous value after processing each character.

This way, every Roman numeral is processed exactly once, giving an efficient solution without explicitly checking combinations like IV, IX, XL, XC, CD, or CM.

### Lines / Logic To Be Careful With
16 while the current number is smaller than prev subtraction should be done with total ans not the prev

### Edge Cases Handled
when the smaller roman is there before a bigger roman ex:-(IV)

## Solution

```java
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
            map.put('I',1);
            map.put('M',1000);  
            map.put('V',5); 
            map.put('X',10); 
            map.put('L',50); 
            map.put('C',100); 
            map.put('D',500);
        
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            if(map.get(s.charAt(i))<prev){
                ans-=map.get(s.charAt(i));
            }
            
            else{                             
            

         ans += map.get(s.charAt(i));
        }
        prev = map.get(s.charAt(i));
        }
        return ans;
    }
}
```
