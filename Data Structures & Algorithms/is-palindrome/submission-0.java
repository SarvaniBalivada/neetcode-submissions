class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        return palindrome(sb.toString())?true:false;
        
    }

    public boolean palindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
        
    }
}
