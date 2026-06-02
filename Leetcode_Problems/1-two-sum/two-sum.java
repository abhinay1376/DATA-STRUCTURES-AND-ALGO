class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){   
         int needed_val=target-nums[i];
         if(map.containsKey(needed_val)){
            return new int[]{map.get(needed_val),i};
        
         }
         map.put(nums[i],i);
    }
    return new int[]{};
}
}