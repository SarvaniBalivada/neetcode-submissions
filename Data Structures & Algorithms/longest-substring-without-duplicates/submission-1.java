class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,n=s.length();
        int max=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int end=0;end<n;end++){
            char c=s.charAt(end);
            if(map.containsKey(c)) {
                start=Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
            max=Math.max(max,end-start+1);
            
        }

        return max;
    }
}
