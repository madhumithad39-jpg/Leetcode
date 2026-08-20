class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n+m];
        int k =0;
        for(int i = 0; i<n;i++){
            merged[k++] = nums1[i];
        }
        for(int i = 0; i<m;i++){
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);
        int t = merged.length;
        if(t%2 == 1){
            return (double) merged[t/2];
        }
        else{
            int m1 = merged[t/2-1];
            int m2 = merged[t/2];
            return((double) m1 + (double) m2)/2.0;
        }
    }
}