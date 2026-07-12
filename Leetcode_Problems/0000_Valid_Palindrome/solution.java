1class Solution {
2    public boolean isPalindrome(String s) {
3        String t=new String(s.toLowerCase());
4       t=t.replaceAll("[^a-z0-9]","");
5        int left=0;
6        int right=t.length()-1;
7        while(left<right){
8            if(t.charAt(left)!=t.charAt(right))
9            return false;
10            else{
11                left++;
12                right--;
13            }
14        }
15        return true;
16   }
17}