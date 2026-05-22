import java.util.*;
class Bubble_sort{
    public static void sort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
                System.out.print("THE SORTED ARRAY IS :");
                sort(arr);

    }
}