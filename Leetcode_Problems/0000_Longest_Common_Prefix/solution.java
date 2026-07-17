1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s=strs[0];
5        int count=0;
6        String t=strs[strs.length-1];
7        for(int i=0;i<s.length();i++){
8            if(s.charAt(i)==t.charAt(i))
9            count++;
10            else 
11            break;
12        }
13        return s.substring(0,count);
14    }
15}