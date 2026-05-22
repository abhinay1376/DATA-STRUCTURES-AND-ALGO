import java.util.*;
class Insertion_sort{
    public static void Sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("the sorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);

    }
}