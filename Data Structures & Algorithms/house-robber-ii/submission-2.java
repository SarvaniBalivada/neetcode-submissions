class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];

        dp1[0]=nums[0];
        

        for(int i=1;i<n;i++){
            int skip=dp1[i-1];
            int rob=nums[i];
            if(i-2>=0){
                rob+=dp1[i-2];
            }

            dp1[i]=Math.max(skip,rob);
        }
    
        dp2[1]=nums[1];

        for(int i=2;i<n;i++){
            int skip=dp2[i-1];
            int rob=nums[i];
            if(i-2>=1){
                rob+=dp2[i-2];
            }

            dp2[i]=Math.max(skip,rob);
        }

        return Math.max(dp1[n-2],dp2[n-1]);
    
    }
}
