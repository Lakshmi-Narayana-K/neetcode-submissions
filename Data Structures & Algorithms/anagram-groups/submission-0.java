class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){

            char[] chs = str.toCharArray();
            Arrays.sort(chs);

            String key = new String(chs);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        result.addAll(map.values());

        return result;
    }
}
