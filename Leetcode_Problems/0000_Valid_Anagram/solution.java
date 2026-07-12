1class Solution {
2    public boolean isAnagram(String s, String t) {
3       HashMap<Character,Integer> map=new HashMap<>(); 
4              HashMap<Character,Integer> map1=new HashMap<>(); 
5              for(int i=0;i<s.length();i++){
6                  map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
7              }
8 for(int i=0;i<t.length();i++){
9                  map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
10              }
11              return map.equals(map1);
12
13    }
14}