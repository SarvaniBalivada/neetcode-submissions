class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        
        int[][] dp=new int[n][n+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return recurse(0,-1,nums,dp);
    }

    public int recurse(int i,int prevIdx,int[] nums,int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][prevIdx+1]!=-1) return dp[i][prevIdx+1];
        int pick=0;
        int notPick=recurse(i+1,prevIdx,nums,dp);
        if(prevIdx==-1 || nums[i]>nums[prevIdx]){
            pick=1+recurse(i+1,i,nums,dp);
        }
        return dp[i][prevIdx+1]=Math.max(pick,notPick);
    }
}
