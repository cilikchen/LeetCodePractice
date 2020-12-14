public class LeetCodeBiweekly39A { //5550
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];

        if (k == 0) {
            return ans;
        }

        if (k > 0) {
            for (int i = 0; i < len; i++) {
                int temp = 0;
                for (int j = i + 1; j <= i + k; j++) {
                    temp += code[j % len];
                }
                ans[i] = temp;
            }
        } else {
            for (int i = 0; i < len; i++) {
                int temp = 0;
                for (int j = i - 1; j >= i + k; j++) {
                    temp += code[(j + len) % len];
                }
                ans[i] = temp;
            }

        }
        return ans;
    }
}
