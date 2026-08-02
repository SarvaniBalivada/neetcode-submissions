class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
       
        dp[0]=nums[0];
    

        for(int i=1;i<n;i++){

            int skip=dp[i-1];
            int rob=nums[i];

            if(i-2>=0){
                rob+=dp[i-2];
            }
            

            dp[i]=Math.max(rob,skip);
        }

        return dp[n-1];
    }

}
