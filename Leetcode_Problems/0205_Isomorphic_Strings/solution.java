/*
Problem Revision Notes

Problem:    Isomorphic Strings
Platform:   LeetCode
Difficulty: Easy
Date:       2026-07-20

──────────────────────────────────────────────────

Intuition
so we use one to one mapping here one map checks from s-t and another t-s

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
if conditions before adding the elements to map

──────────────────────────────────────────────────

Edge Cases Handled
if the both lengths are not same then the ans should be false at the beggining

──────────────────────────────────────────────────

Mistakes I Made
used c1,c2 in map2 also but it should be reverse

──────────────────────────────────────────────────

Future Reminder
f -> b
o -> a
o -> r

Same character o maps to both a and r.

❌ Not allowed.

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(n)

══════════════════════════════════════════════════
*/

1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        HashMap<Character,Character> map=new HashMap<>();
7                HashMap<Character,Character> map1=new HashMap<>();
8                for(int i=0;i<s.length();i++){
9                    char c1=s.charAt(i);
10                    char c2=t.charAt(i);
11                      if(map1.containsKey(c2)&&map1.get(c2)!=c1)
12                    return false;
13                      if(map.containsKey(c1)&&map.get(c1)!=c2)
14                    return false;
15                  
16                    map.put(c1,c2);
17                    map1.put(c2,c1);
18                  
19                }
20                return true;
21
22    }
23}