class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int last = heights.length-1;
        int start = 0;

        while(start <= last){
            int height = Math.min(heights[start], heights[last]);
            int length = last - start;
            int area = length*height;

            if(area > maxArea){
                maxArea = area;
            }
            if(heights[start] < heights[last]){
                start++;
            }
            else if(heights[last] <= heights[start]){
                last--;
            } 
        }
        return maxArea;
    }
}
