class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return recurse(n-1,nums,dp);
    }

    public int recurse(int i,int[] nums,int[] dp){
        if(i==0) return nums[0];
        if(i<0) return 0;

        if(dp[i]!=-1) return dp[i];

        int skip=recurse(i-1,nums,dp);
        int rob=nums[i]+recurse(i-2,nums,dp);

        return dp[i]=Math.max(rob,skip);
    }

}
