class Smallest{
    public static void main(String args[]){
        int arr[]={1,2,5,9,5,4,7,6};
        int n=arr.length;
        int result=max(arr,n);
        System.out.println("the smallest element is"+result);
    }
    public static int max(int arr[],int n){
        int minimum=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
}