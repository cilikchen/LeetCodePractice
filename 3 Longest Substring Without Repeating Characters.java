import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int front =0;
        int tail =0;
        int max =0;
        while (front< s.length()){
            if(!set.contains(s.charAt(front))){
                set.add(s.charAt(front));
                max = Math.max(max,front-tail+1);
                front++;
            }else{
                set.remove(s.charAt(tail));
                tail++;
            }
        }
        return max;
    }
}
