class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[128];
        int left=0,n=s.length();
        int maxLen=0;
        int maxFreq=0;
        for(int right=0;right<n;right++){
            char rightChar=s.charAt(right);
            freq[rightChar-'A']++;
            
            maxFreq=Math.max(maxFreq,freq[rightChar-'A']);

            while((right-left+1)-maxFreq>k){
                char leftChar=s.charAt(left);
                freq[leftChar-'A']--;
                left++;
            }

            maxLen=Math.max(maxLen,right-left+1);
            
        }
        return maxLen;
    }
}
