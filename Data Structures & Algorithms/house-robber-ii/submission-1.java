class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(recurse(n-2,0,nums,dp1) , recurse(n-1,1,nums,dp2));
    }

    public int recurse(int i, int start,int[] nums,int[] dp){
        int n=nums.length;
        
        if(i<start) return 0;

        if(dp[i]!=-1) return dp[i];

        int skip=recurse(i-1,start,nums,dp);
        int rob=nums[i]+recurse(i-2,start,nums,dp);

        return dp[i]=Math.max(rob,skip);
    
    }
}
