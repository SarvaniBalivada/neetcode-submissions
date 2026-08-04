class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=recurse(n-1,coins,amount,dp);
        
        return ans>=(1e9)?-1:ans;
    }

    public int recurse(int i,int[] coins,int target,int[][] dp){
        if(i<0 || target<0) return (int)1e9; 
        if(target==0) return 0;
        if(dp[i][target]!=-1) return dp[i][target];
        int notPick=recurse(i-1,coins,target,dp);
        int pick=(int)1e9;
        if(coins[i]<=target){
            pick=1+recurse(i,coins,target-coins[i],dp);
        }

        return dp[i][target]=Math.min(pick,notPick);

    }
}
