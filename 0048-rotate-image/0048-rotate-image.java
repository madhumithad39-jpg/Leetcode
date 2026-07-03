class Solution {
    public void rotate(int[][] matrix) {
        for(int row=0;row<matrix.length;row++){
            for(int col=row+1;col<matrix.length;col++){

            matrix[row][col] ^=matrix[col][row];
            matrix[col][row] ^=matrix[row][col];
            matrix[row][col] ^=matrix[col][row];
            }
        }
        for(int row=0;row<matrix.length;row++){
            int left=0,right=matrix[row].length-1;
            while(left<right){
                matrix[row][left] ^= matrix[row][right];
                matrix[row][right] ^=matrix[row][left];
                matrix[row][left] ^= matrix[row][right];
                left++;right--;
                }
            }
        }
        public static void main(String[] args) {
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            Solution obj = new Solution();
            obj.rotate(arr);
            for(int row=0;row<arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
        }
    }
}

