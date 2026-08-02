class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int i=0,j=1;
        while(j<n){
            int profit=prices[j]-prices[i];
            max=Math.max(max,profit);
            if(prices[i]>prices[j]) i=j;
            j++;
        }
        return max;
    }
}
