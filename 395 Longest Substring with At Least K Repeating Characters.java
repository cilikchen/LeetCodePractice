public class LeetCode395 {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        int[] cnt = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && cnt[i] < k) {
                flag = false;
            }
        }
        if (flag) {
            return s.length();
        }
        int i = 0;
        int t = 0;
        int ans = 0;
        while (i < len) {
            if (cnt[s.charAt(i) - 'a'] >= k) {
                t = i;
                while (t < len) {
                    if (cnt[s.charAt(t) - 'a'] >= k) t++;
                    else break;
                }
                ans = Math.max(ans, longestSubstring(s.substring(i, t), k));
                i = t;
            } else {
                i++;
            }
        }
        return ans;
    }
}
