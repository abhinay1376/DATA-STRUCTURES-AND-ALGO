import java.util.*;
class divisors{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
                System.out.println("the divisors are:");
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}