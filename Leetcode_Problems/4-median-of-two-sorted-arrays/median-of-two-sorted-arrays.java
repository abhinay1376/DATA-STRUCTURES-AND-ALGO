class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     List<Integer> list = new ArrayList<>();


        for (int num : nums1) list.add(num);
        for (int num : nums2) list.add(num);
        Collections.sort(list);

        int n = list.size();
        double median = 0;

        if (n % 2 != 0) {
            median = list.get(n / 2); 
        } else {

            double median1 = list.get(n / 2 - 1);
            double median2 = list.get(n / 2);
            median = (median1 + median2) / 2.0;
        }

        return median;

    }
}