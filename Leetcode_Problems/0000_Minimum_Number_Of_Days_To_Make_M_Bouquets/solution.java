       while(left<=right){
        mid=(right+left)/2;
            if((bloom(nums,mid,m,k))==true){

            

            ans1=Math.min(ans1,mid);
           else 
           left=mid+1;
            right=mid-1;
            }
       }
        return ans1;
    }
