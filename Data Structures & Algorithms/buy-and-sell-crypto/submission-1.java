class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                max=Math.max(prices[j]-prices[i],max);
            }
        }
        return max;
    }
}
