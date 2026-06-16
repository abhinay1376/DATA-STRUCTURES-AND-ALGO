1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3     List<Integer> list = new ArrayList<>();
4
5
6        for (int num : nums1) list.add(num);
7        for (int num : nums2) list.add(num);
8        Collections.sort(list);
9
10        int n = list.size();
11        double median = 0;
12
13        if (n % 2 != 0) {
14            median = list.get(n / 2); 
15        } else {
16
17            double median1 = list.get(n / 2 - 1);
18            double median2 = list.get(n / 2);
19            median = (median1 + median2) / 2.0;
20        }
21
22        return median;
23
24    }
25}