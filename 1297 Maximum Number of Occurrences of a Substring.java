import java.util.*;

public class LeetCode1297 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
//        int maxFreq = 0;
//        for (int size = minSize; size <= maxSize; size++) {
//            Map<String, Integer> map = new HashMap<>();
//            for (int i = 0; i <= s.length() - size; i++) {
//                String substring = s.substring(i, i + size);
//                Set<Character> set = new HashSet<>();
//                for (int j = 0; j < substring.length(); j++) {
//                    set.add(substring.charAt(j));
//                    if (set.size() > maxLetters) {
//                        break;
//                    }
//                }
//                if (set.size() <= maxLetters) {
//                    map.put(substring, map.getOrDefault(substring, 0) + 1);
//                }
//            }
//            for (String key : map.keySet()) {
//                maxFreq = Math.max(maxFreq, map.get(key));
//            }
//        }
//        return maxFreq;


        int left = 0;
        int maxCount = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<Character, Integer> contains = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            contains.put(s.charAt(right), contains.getOrDefault(s.charAt(right), 0) + 1);

            while ((contains.size() > maxLetters || (right - left + 1) > minSize) && left <= right) {
                contains.put(s.charAt(left), contains.getOrDefault(s.charAt(left), 0) - 1);
                if (contains.get(s.charAt(left)) == 0) {
                    contains.remove(s.charAt(left));

                }
                left++;
            }

            if (contains.size() <= maxLetters && right - left + 1 >= minSize) {
                String sub = s.substring(left, right + 1);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                maxCount = Math.max(maxCount, map.get(sub));
            }


        }

        return maxCount;

    }
}
