import java.util.*;
class Rotate_by_k{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.print("enter the position left or right:");
                String position=sc.nextLine();
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
                System.out.print("enter the postion k value:");
                int k=sc.nextInt();
        int arr[]=new int[n];
          System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
             
       if(position.equals("right")){
       right(arr,k); }
       else 
       left(arr,k);
    }
    public static void right(int arr[],int k){
        int n=arr.length;
      
        int swap=0;
        while(swap<k){
              int temp=arr[n-1];
        for(int i=n-2;i >= 0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        swap++;
        }
        System.out.println("the array after right rotation is :");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void left(int arr[],int k){
        int n=arr.length;
        int swap=0;
        while(swap<k){
                    int temp=arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        swap++;
        }
        System.out.println("the array after left rotation is :");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
