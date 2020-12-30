class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int distinct =k;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0,end =0;
        while(end<s.length()) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.size() > distinct) {
                c = s.charAt(start);
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
                start++;
                max = Math.max(end-start+1, max);
            }
            end++;
        }
        max = Math.max(s.length()-start, max);
        return max;
    }
}
