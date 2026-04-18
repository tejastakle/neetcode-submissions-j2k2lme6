class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxArea = 0;
        while(start<end) {
            int currentArea = (end - start)*Math.min(heights[start],heights[end]);
            if(currentArea>maxArea) {
                maxArea = currentArea;
            }

            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }    
        
        return maxArea;
        
    }
}
