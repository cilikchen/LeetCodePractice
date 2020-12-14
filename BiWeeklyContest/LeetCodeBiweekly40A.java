public class LeetCodeBiweekly40A {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        String currentWord = word;

        while (currentWord.length() <= sequence.length()) {
            if (sequence.contains(currentWord) || sequence.equals(currentWord)) {
                ans++;
                currentWord = currentWord + word;
            } else {
                break;
            }
        }
        return ans;
    }
}
