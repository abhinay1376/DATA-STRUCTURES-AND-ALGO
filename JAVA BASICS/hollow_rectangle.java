class hollow_rectangle{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1 || i==5){
                for(int j=1;j<=2*5;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=8;j++)   {
                    System.out.print(" ");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");          
                }
                }   
                System.out.println();
                
        }
        }
    }
