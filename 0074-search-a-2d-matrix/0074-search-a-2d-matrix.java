class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rSize = matrix.length, cSize = matrix[0].length;
        int start=0, end=rSize*cSize-1, mid=0, row=0, col=0;
        while(start<=end){
            mid = start+(end-start)/2;
            row=mid/cSize;col=mid%cSize;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target)
            start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}