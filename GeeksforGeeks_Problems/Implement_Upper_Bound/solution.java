class Solution {
    int upperBound(int[] arr, int target) {
                int left=0;
        int right=arr.length-1;
        int mid=-1;
        int ans=arr.length;
        while(left<=right)
{
    mid=left+(right-left)/2;
    if(arr[mid]>target){
    ans=mid;
    right=mid-1;
    }
    else 
    left=mid+1;
}
return ans;
            }
}
