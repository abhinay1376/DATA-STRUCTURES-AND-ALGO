class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int needed_value=target-nums[i];
            if(map.containsKey(needed_value)&&(map.get(needed_value)!=i)){
                return new int[]{map.get(needed_value),i};
            
            }
            

        }
        return new int[]{};
    }

}