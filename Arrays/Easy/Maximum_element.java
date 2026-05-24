class Maximum_element{
    public static void main(String args[]){
        int arr[]={0,5,9,5,4,7,6};
        int n=arr.length;
        int result=max(arr,n);
        System.out.println("the largest element is"+result);
    }
    public static int max(int arr[],int n){
        int maximum=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}