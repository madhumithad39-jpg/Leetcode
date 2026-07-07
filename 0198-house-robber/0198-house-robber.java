class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int p2=nums[0];
        int p1=Math.max(nums[0],nums[1]);
        int current=0;
        for(int index=2;index<nums.length;index++){
            current=Math.max(p1,(nums[index]+p2));
            p2=p1;
            p1=current;
        }
        return p1;
    }
}