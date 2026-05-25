class Remove_duplicates{

    public static void main(String[] args){

        int arr[]={1,1,1,2,2,2,4,4,5,5,6,6,6,7,7};

        int result= remove(arr);

        for(int i=0;i<result;i++){

            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}