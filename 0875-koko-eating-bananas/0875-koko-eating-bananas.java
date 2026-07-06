class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = Arrays.stream(piles).max().orElse(0);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canEat(piles, h, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean canEat(int[] arr, int hours, int mid) {

        long curHours = 0;

        for (int each : arr) {
            curHours += (each + mid - 1) / mid;
        }

        return curHours <= hours;
    }
}