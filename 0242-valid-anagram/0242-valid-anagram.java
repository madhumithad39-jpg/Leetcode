class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(
            sArr, tArr
        );
    }
     public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.isAnagram("anagram", "nagaram"));
        System.out.println(obj.isAnagram("ant", "tan"));
        System.out.println(obj.isAnagram("madam", "mam"));
    }
}