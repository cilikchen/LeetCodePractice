import java.util.*;

public class LeetCodeBiweekly41C {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        int[][] sum = new int[n][2];

        for (int i = 0; i < n; i++) {
            sum[i][0] = aliceValues[i] + bobValues[i];
            sum[i][1] = i;
        }

        Arrays.sort(sum, Comparator.comparingInt(a -> a[0]));
        Collections.reverse(Arrays.asList(sum));

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                aliceScore += aliceValues[sum[i][1]];
            } else {
                bobScore += bobValues[sum[i][1]];
            }
        }
        return Integer.compare(aliceScore, bobScore);

    }
}
