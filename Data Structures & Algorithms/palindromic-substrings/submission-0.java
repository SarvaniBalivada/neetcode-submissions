class Solution {
    public int countSubstrings(String s) {
       if(s==null || s.length()==0) return 0;
        int start=0,end=0,total=0;

        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            total+=len1+len2;
        }

        return total;
    }

    public int expand(String s,int left,int right){
        int cnt=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            cnt++;
        }

        return cnt;
    }
}
