class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,mWater=0;
        while(left<right){
            int width=right-left;
            int minheight = Math.min(height[left],height[right]);
             mWater = Math.max(mWater, width*minheight);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return mWater;
    }
     public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        Solution obj = new Solution();

        System.out.println(obj.maxArea(arr));
    }
}