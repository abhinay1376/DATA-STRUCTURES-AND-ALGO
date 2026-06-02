public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }

    public static int longestSubarray(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int m = i; m <= j; m++) {
                    sum = sum + arr[m];
                }
                if (sum == k) {
                    int length = j - i + 1;
                    max = Math.max(length, max);
                }

            }
        }
        return max;
    }

}
