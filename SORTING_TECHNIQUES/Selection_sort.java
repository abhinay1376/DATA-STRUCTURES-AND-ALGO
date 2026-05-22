import java.util.*;
class Selection_sort{
    public static void sort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
                temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
        System.out.println("the sorted array is :");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the size of the array: ");
                int n=sc.nextInt();
                int arr[]=new int[n];        
                System.out.print("enter the elements of the array: ");
                for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
                sort(arr);
                

    }
}