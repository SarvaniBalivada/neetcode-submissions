class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;
        
        int left=0,right=n-1;
        while(left<right){
            max=Math.max(max,Math.min(heights[left],heights[right]) * (right-left));
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
    }
}
