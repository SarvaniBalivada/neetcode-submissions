class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return recurse(n-1,s,dp);
    }

    public int recurse(int i,String s,int[] dp){
        if(i<0) return 1;
        if(i==0) return s.charAt(0)=='0'?0:1;
        if(dp[i]!=-1) return dp[i];
        int ways=0;
        if(s.charAt(i)!='0'){
            ways+=recurse(i-1,s,dp);
        }

        int twoDigit=(s.charAt(i-1)-'0')*10+(s.charAt(i)-'0');
        if(twoDigit>=10 && twoDigit<=26){
            ways+=recurse(i-2,s,dp);
        }
        

        return dp[i]=ways;
    }
}
