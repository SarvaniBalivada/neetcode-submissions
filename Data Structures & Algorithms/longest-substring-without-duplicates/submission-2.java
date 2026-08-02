class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,n=s.length();
        int right=0;
        int max=0;
        Set<Character>set=new HashSet<>();
        while(right<n){
            char rightChar=s.charAt(right);
            while(set.contains(rightChar)){
                char leftChar=s.charAt(left);
                set.remove(leftChar);
                left++;
            }
            set.add(rightChar);
            max=Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
}
