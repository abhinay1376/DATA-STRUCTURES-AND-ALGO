class reverse{
    public static void main(String args[]){
        int n=432;
        int rev=0;
        int t=n;
        while(t!=0){
            rev=rev*10+t%10;
            t=t/10;
        }
        System.out.println(rev);
    }
}