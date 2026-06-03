import java.util.HashMap;

public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }

    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int prefix_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];
            if (prefix_sum == k) {
                max = i + 1;
            }
            int remaining = prefix_sum - k;

            if (map.containsKey(remaining)) {
                int length = i - map.get(remaining);
                max = Math.max(length, max);
            }
            if (!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i);
            }

        }
        return max;
    }
}
