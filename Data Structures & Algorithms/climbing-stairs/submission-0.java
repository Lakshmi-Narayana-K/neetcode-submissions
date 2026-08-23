class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return totalWays(n, map);   
    }

    public int totalWays(int n, Map<Integer, Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n == 0) return 1;
        if(n < 0) return 0;

        int left = totalWays(n -1, map);
        int right = totalWays(n - 2, map);

        int total =  left + right;
        map.put(n, total);
        return map.get(n);
    }
}
