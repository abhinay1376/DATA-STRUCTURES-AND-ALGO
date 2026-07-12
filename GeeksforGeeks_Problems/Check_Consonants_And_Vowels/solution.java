class Solution {

    static void checkString(String s) {
        int count1=0;
        int count=0;
       for(int i=0;i<s.length();i++){
           
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
           count++;
           else 
           count1++;
       }
       if(count>count1) System.out.println("Yes");
       else if(count<count1) System.out.println("No");
       else System.out.println("Same");
        
    }
}