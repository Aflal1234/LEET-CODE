class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col;
        while(low<high){
            int mid=low+(high-low)/2;
            int row1=mid/col;
            int col1=mid%col;
            if(target==matrix[row1][col1]){
                return true;
            }
            else if(target>matrix[row1][col1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return false;
    }
}