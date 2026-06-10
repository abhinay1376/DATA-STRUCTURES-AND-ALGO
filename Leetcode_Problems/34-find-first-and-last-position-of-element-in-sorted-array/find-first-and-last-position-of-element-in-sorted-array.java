class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right=mid-1;
                ans[0]=mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else 
                right=mid-1;
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
left =mid+1;
                ans[1]=mid;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else 
                left=mid+1;

        }
            return ans;

    }
    }
