class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return recurse(0,n,dp);
    }
    
    public int recurse(int i,int n,int[] dp){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=recurse(i+1,n,dp) + recurse(i+2,n,dp);
    }
}
