1class Solution {
2    public boolean isAnagram(String s, String t) {
3      
4        HashMap<Character,Integer> map=new HashMap<>();
5        HashMap<Character,Integer> map1=new HashMap<>();
6        for(int i=0;i<s.length();i++)
7{
8    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
9}
10        for(int i=0;i<t.length();i++)
11{
12    map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
13}
14
15
16
17        return map.equals(map1);
18    }
19}