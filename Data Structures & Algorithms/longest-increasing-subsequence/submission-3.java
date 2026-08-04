class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        
        int[][] dp=new int[n+1][n+1];
        
        
        for(int i=n-1;i>=0;i--){
            for(int prevIdx=i-1;prevIdx>=-1;prevIdx--){
                    int pick=0;
                    int notPick=dp[i+1][prevIdx+1];
                    if(prevIdx==-1 || nums[i]>nums[prevIdx]){
                        pick=1+dp[i+1][i+1];
                    } 
                    dp[i][prevIdx+1]=Math.max(pick,notPick);
            }
        }
        
        
        return dp[0][0];
    }
}
