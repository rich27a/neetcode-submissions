class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){

            int validHeight = Math.min(heights[left], heights[right]);

            int probabilyNewMaxArea = validHeight * (right - left);

            maxArea = Math.max(maxArea, probabilyNewMaxArea);

            if(validHeight == heights[left]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
