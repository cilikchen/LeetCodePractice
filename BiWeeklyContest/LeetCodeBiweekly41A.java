public class LeetCodeBiweekly41A {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            map[allowed.charAt(i) - 'a'] = true;
        }
        int ans = words.length;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (!map[j] && words[i].contains(Character.toString((char) (j + 'a')))) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }

    private boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }
}
