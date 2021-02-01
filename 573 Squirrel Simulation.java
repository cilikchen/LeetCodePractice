public class LeetCode573 {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {

        int ans = 0;
        int diff =Integer.MIN_VALUE;

        for (int[] nut : nuts) {
            ans += Math.abs(nut[0] - tree[0])*2 + Math.abs(nut[1] - tree[1]) *2;

            diff = Math.max(diff, distance(nut, tree) - distance(nut, squirrel));
        }


        return ans - diff;
    }

    private int distance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
