class Second_maximum{
    public static void main(String[] args){
        int arr[]={110,5,4,11,2,6,5,7};
        int n=arr.length;
        int result=second_max(arr,n);
        System.out.println("the second largest element is"+result);
    }
    public static int second_max(int arr[],int n){
        int temp;
        int max=arr[0];
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
              sec_max=max;
              max=arr[i];
            }
            if(arr[i]>sec_max && arr[i]!=max){
                sec_max=arr[i];
            }
        }
        return sec_max;
    }
}