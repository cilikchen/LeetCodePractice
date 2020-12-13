public class LeetCodeBiweekly41B {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int total = 0;
        int totalcurrent = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {

            int current = nums[i];
            total -= current;

            if (i != 0 && nums[i] == nums[i - 1]) {
                ans[i] = ans[i - 1];
            } else {
                int sum = 0;
                sum = (total - (n - i - 1) * nums[i]) + ((i) * nums[i] - totalcurrent);
                ans[i] = sum;
            }
            totalcurrent += current;

        }


        return ans;

    }
}
