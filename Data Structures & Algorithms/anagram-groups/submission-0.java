class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        
        int n=strs.length;
        boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++){
            List<String>temp=new ArrayList<>();

            if(!vis[i]){
                temp.add(strs[i]);
                vis[i]=true;
                for(int j=i+1;j<n;j++){
                    if(!vis[j] && isAnagram(i,j,strs)){
                        temp.add(strs[j]);
                        vis[j]=true;
                    }
                }
                ans.add(temp);
            }

            
        }

        return ans;
        
    }

    public boolean isAnagram(int i,int j,String[] strs){
        char[] s1=strs[i].toCharArray();
        char[] s2=strs[j].toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.length!=s2.length) return false;
        for(int k=0;k<s1.length;k++){
            if(s1[k]!=s2[k]) return false;
        }

        return true;
    }
}
