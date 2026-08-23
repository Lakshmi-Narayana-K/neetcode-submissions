class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = newStr.length()-1;

        while(start < end){
            if(newStr.charAt(start) != newStr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
