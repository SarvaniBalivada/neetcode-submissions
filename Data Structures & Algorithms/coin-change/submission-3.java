class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] prev=new int[amount+1];
        
        prev[0]=0;
    
        
        for(int target=0;target<=amount;target++){
            prev[target]=(int)1e9;
        }
        
        
        for(int i=1;i<=n;i++){
            int[] cur=new int[amount+1];
            cur[0]=0;
            for(int target=1;target<=amount;target++){

                int notPick=prev[target];
                int pick=(int)1e9;
                if(coins[i-1]<=target){
                    pick=1+cur[target-coins[i-1]];
                }
                cur[target]=Math.min(pick,notPick);
            }
            prev=cur;
        }
        

        return prev[amount] >=(int)1e9?-1:prev[amount];

    }
}
