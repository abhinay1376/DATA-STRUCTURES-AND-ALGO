1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n=nums.length;
4         HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<n;i++){   
6         int needed_val=target-nums[i];
7         if(map.containsKey(needed_val)){
8            return new int[]{map.get(needed_val),i};
9        
10         }
11         map.put(nums[i],i);
12    }
13    return new int[]{};
14}
15}