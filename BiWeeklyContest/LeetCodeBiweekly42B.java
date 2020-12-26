public class LeetCodeBiweekly42B {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0;
        int n = customers.length;
        int nextAvailable = 0;

        for (int i = 0; i < n; i++) {
            if (nextAvailable <= customers[i][0]) {
                ans += customers[i][1];
                nextAvailable = customers[i][0] + customers[i][1];
            } else {
                ans += (nextAvailable - customers[i][0]) + customers[i][1];
                nextAvailable += customers[i][1];
            }

        }

        return ans / n;

    }
}
