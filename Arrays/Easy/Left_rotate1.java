import java.util.*;
class Left_rotate1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       left(arr);
    }
    public static void left(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("the array after left rotation is :");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}