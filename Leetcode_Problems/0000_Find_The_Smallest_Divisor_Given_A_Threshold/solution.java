            }
            else
            left=mid+1;
        }
        return ans;
    }
    public static boolean div(int[] nums,int mid,int t){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            right=mid-1;
            ans=mid;
            if((div(nums,mid,threshold))==true){
            mid=(right+left)/2;
        while(left<=right){
        int mid=0;
        int ans=-1;
            sum+=(int)Math.ceil((double)nums[i]/mid);
        }
        if(sum<=t) return true;
        else return false;
    }
}
        int right=max;
