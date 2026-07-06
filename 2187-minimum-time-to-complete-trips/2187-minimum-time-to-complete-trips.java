class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start=1;long end=Long.MAX_VALUE; long ans=0; long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(canComplete(time,totalTrips,mid)){
                end=mid-1;ans=mid;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean canComplete(int[]arr,int trip,long mid){
        long sum=0;
        for(int each:arr){
            sum+=(mid/each);
            if(sum>=trip){
                return true;
            }
        }
        return sum>=trip;
    }
}