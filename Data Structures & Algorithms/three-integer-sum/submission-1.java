class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int target=-nums[i];
            List<List<Integer>>temp=find(nums,target,i);
            set.addAll(temp);
        }

        return new ArrayList<>(set);
    }

    public List<List<Integer>> find(int[]nums,int target,int i){
        List<List<Integer>>ans=new ArrayList<>();
        int j=i+1,k=nums.length-1;
        while(j<k){
            if(nums[j]+nums[k]==target){
                ans.add(Arrays.asList(-target,nums[j],nums[k]));
                j++;
                k--;
            }
            
            else if(nums[j]+nums[k]<target){
                j++;
            }
            else{
                k--;
            }
        }

        return ans;
    
    }
}
