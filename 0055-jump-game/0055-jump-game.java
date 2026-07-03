class Solution {
    public boolean canJump(int[] nums) {
       int maxLen=0, index=0, size=nums.length;
        while(index<size){
            if(index>maxLen)return false;
            maxLen= Math.max(maxLen, index+nums[index]);
            index++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        Solution obj = new Solution();

        System.out.println(obj.canJump(nums1));
        System.out.println(obj.canJump(nums2));
    }
}