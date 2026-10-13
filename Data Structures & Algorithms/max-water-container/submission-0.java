class Solution {
    public int maxArea(int[] heights) {

        int max = 0;
        int curr = 0;
        int right = heights.length-1;
        int left = 0;

        while (left <= right){
            int width = right - left;
            int height = Math.min(heights[left],heights[right]);
            curr = width * height;

            if (curr > max){
                max = curr;
            } 

            if (heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }


        }
        return max;
        
    }
}
