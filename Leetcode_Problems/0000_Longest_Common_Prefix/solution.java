1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s=new String(strs[0]);
5        String t=new String(strs[strs.length-1]);
6        for(int i=0;i<t.length();i++){
7            if(s.charAt(i)!=t.charAt(i))
8            return s.substring(0,i);
9        }
10        return "";
11    }
12}