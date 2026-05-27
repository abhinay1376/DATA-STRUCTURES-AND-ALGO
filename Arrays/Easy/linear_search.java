import java.util.Scanner;
class linear_search{
    public static void main(String args[]){
        int arr[]={1,90,2,3,4,4,5};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int temp=sc.nextInt();
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==temp){
        System.out.println("element is found   "+i);
        res+=1;
           break;
        }
    
    }
    if(res!=1){
              
        System.out.println("-1");
          

    }

}
}