public class LeetCode1165 {
    public int calculateTime(String keyboard, String word) {
        int ans = 0;
        int current = 0;
        int[] keyboardPosition = new int[26];

        for(int i = 0; i < keyboard.length(); i++){
            int now = keyboard.charAt(i) - 'a';
            keyboardPosition[now] = i;
        }

        for(int i = 0; i < word.length(); i++){
            int now = word.charAt(i) - 'a';
            ans += Math.abs( keyboardPosition[now] - current );
            current = keyboardPosition[now];
        }

        return ans;

    }
}
