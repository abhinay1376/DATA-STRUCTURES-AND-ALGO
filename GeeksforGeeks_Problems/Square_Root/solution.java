class Solution {
    int floorSqrt(int n) {
        int i=1;
        int ans=1;
      while(i<n){
         
          if(i*i>n)
          break;
          ans=i;
          i++;

         
      }
      return ans;
    }
}