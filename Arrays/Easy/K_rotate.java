import java.util.*;
class K_rotate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position RIGHT or LEFT");
        String position=sc.nextLine();
          System.out.println("enter the rotations of the array:");
        int k=sc.nextInt();
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
           System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int initial=0;
        if(position.equals("left")){
                reverse(arr,initial,k-1);
                reverse(arr,k,n-1);
                 reverse(arr,initial,n-1);
                  }
                  else{
        reverse(arr,n-k,n-1);
        reverse(arr,initial,k);
        reverse(arr,initial,n-1);}
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int i,int n){
         for(int j=i;j<n/2;j++){
            int temp=arr[j];
            arr[j]=arr[n-1-j];
            arr[n-1-j]=temp;
         }
     
         }
}
