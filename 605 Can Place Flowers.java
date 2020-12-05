public class LeetCode605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int cnt = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            cnt++;
            return cnt >= n ? true : false;
        } else if (flowerbed.length == 1 && flowerbed[0] == 1) {
            return cnt >= n ? true : false;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            cnt++;
            flowerbed[0] = 1;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                cnt++;
            }
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            cnt++;
            flowerbed[flowerbed.length - 1] = 1;
        }

        return cnt >= n ? true : false;
    }
}
