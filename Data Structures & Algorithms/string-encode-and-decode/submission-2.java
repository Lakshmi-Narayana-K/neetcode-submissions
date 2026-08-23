class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int delimiter = str.indexOf('#', index);
            int lenOfWord = Integer.parseInt(str.substring(index, delimiter));
            
            String word = str.substring(delimiter + 1, delimiter + 1 + lenOfWord);
            res.add(word);

            index = delimiter + 1 + lenOfWord;
        }

        return res;
    }
}
