class Missing_number {
    public static void main(String[] args) {

        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        int n = 8;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println(missing);
    }
}