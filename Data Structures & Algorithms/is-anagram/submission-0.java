class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            int a = map1.get(s.charAt(i));
            int b = 0;
            if(map2.containsKey(s.charAt(i))){
                b = map2.get(s.charAt(i));
            }

            if(a!=b){
                return false;
            }
        }

        return true;
    }
}
