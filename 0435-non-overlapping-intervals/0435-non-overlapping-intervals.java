class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count = 0, cEnd = intervals[0][1];
        for(int index=1;index<intervals.length;index++){
            if(intervals[index][0]<cEnd) count++;
            else cEnd = intervals[index][1];
        }
        return count;
    }
}