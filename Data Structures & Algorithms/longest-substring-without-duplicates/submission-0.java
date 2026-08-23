class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2) return n;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;

        for(int i=0; i<n ; i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}
