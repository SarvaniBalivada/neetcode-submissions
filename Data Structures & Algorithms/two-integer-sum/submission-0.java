class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }

            else{
                int ind1=map.get(target-nums[i]);
                return new int[]{ind1,i};
            }

        }

        return new int[]{-1,-1};
    }
}
