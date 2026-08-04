class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Boolean[] dp=new Boolean[n];
        
        return recurse(0,s,wordDict,dp);
    }

    public boolean recurse(int i,String s,List<String>wordDict,Boolean[] dp){
        int n=s.length();
        if(i==n) return true;
        if(dp[i]!=null) return dp[i];
        for(String word:wordDict){
            if(s.startsWith(word,i)){
                if(recurse(i+word.length(),s,wordDict,dp)){
                    return dp[i]=true;
                }
            }
        }
        return dp[i]=false;

    }
}
