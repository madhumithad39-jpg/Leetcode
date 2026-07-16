import java.util.HashMap;
import java.util.Map;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> map = new HashMap<>();
        int max = 0, maxCount = 0;
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
            max = Math.max(max, map.get(task));
        }
        for (int freq : map.values()) {
            if (freq == max) {
                maxCount++;
            }
        }
        int intervals = (max - 1) * (n + 1) + maxCount;

        return Math.max(intervals, tasks.length);
    }
}