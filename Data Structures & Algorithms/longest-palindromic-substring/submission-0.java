class Solution {
    int max=0;
    String maxAns="";
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] vis=new boolean[n][n];
        recurse(0,0,s,vis);
        return maxAns;
    } 

    public void recurse(int i,int j,String s,boolean[][] vis){
        int n=s.length();
        if(i>=n || j>=n || i>j || vis[i][j]){
            return;
        }
        vis[i][j]=true;

        if(isPalindrome(s,i,j)){
            int len=j-i+1;
            if(max<len){
                max=len;
                maxAns=s.substring(i,j+1);
            }
        }

        recurse(i,j+1,s,vis);
        recurse(i+1,j,s,vis);

        
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
