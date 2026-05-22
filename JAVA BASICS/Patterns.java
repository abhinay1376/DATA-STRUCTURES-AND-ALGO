import java.util.*;
class Patterns
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println("Next pattern");
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                }
            
System.out.println("Next pattern");
     for(int i=1;i<=5;i++){
        for (int j=1;j<=i;j++){
            System.out.print(i);
               }
               System.out.println();
     }
System.out.println("next pattern");
     for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
    System.out.println();

     }
     System.out.println("next pattern");
  for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
                }
     System.out.println("next pattern");
     int n=5;
  for(int i=1;i<=n;i++)
            {   
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-2*i+1;j++){
                    System.out.print(j);
                }
                
                System.out.println();
                }
            


    }
}
