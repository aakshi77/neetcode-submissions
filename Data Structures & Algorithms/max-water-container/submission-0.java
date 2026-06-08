class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxval=0;
        while(left<right){
            int area=(right-left) * Math.min(heights[left],heights[right]);
            maxval=Math.max(maxval,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxval;
    }
}
