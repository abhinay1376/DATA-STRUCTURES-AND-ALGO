 class Second_smallest{
    public static void main(String[] args){
        int arr[]={110,5,4,11,2,6,5,7};
        int n=arr.length;
        int result=second_min(arr,n);
        System.out.println("the second smallest element is"+result);
    }
    public static int second_min(int arr[],int n){
        int temp;
        int min=arr[0];
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
             sec_min=min;
              min=arr[i];
            }
            if(arr[i] <sec_min && arr[i]!=min){
             sec_min=arr[i];
            }
        }
        return sec_min;
    }
}
