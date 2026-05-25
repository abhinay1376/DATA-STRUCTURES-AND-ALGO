import java.util.*;
class Right_rotate1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       right(arr);
    }
    public static void right(int arr[]){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-2;i >= 0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        System.out.println("the array after right rotation is :");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}