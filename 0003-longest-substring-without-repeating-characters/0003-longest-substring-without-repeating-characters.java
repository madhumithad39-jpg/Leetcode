import java.util.Hashtable;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=s.length(),start=0, end=0,maxLen=0;
        Hashtable<Character,Integer> tab=new Hashtable<>();
        while(end<size){
            char key=s.charAt(end);
            if(tab.containsKey(key))
                start=Math.max(start, tab.get(key)+1);
            tab.put(key, end);
            maxLen=Math.max(maxLen, end-start+1);
            end++;
        }
        return maxLen;
    }
}