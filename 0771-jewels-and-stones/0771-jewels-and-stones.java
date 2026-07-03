class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int count = 0;
        Set<Character> jewelSet = new HashSet<>();
        for(char c : jewels.toCharArray()) jewelSet.add(c);
        for(char c : stones.toCharArray()) 
            if(jewelSet.contains(c)) count++;
        return count;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();

        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
}