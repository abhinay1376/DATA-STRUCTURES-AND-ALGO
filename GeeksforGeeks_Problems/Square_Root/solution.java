class Solution {
    int floorSqrt(int n) {
        int left=1;
        int right=n;
        int ans=1;
      while(left<=right){
          int mid=(right+left)/2;
          if(mid*mid==n)
          return mid;
          else if(mid*mid>n)
          right=mid-1;
          else 
          {
              ans=mid;
           left=mid+1; 
          }
      }
      return ans;
    }
}