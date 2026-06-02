class Sum_subarray {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                }
                System.out.print(sum + " ");

            }
            System.out.println();

        }
    }
}