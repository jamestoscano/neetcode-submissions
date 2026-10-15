class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] < target){
                row = i;
            } else if (matrix[i][0] == target){
                return true;
            }
        }

        int left = 0;
        int right = matrix[0].length-1;

        while (left <= right){
            int mid = left + (right-left)/2;
            System.out.println("Mid: " + mid + "Row: " + row);
            if (matrix[row][mid] == target){
                return true;
            } else if (matrix[row][mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }
}
