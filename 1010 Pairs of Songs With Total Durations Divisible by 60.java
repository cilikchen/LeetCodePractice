public class LeetCode1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] map = new int[60];

        for(int i = 0; i< time.length; i++){
            map[ time[i]%60]++;
        }
        ans+= (map[0]*(map[0]-1))/2;
        ans+= (map[30]*(map[30]-1))/2;

        for(int i=1; i<=29;i++){
            ans += map[i]*map[60-i];
        }

        return ans;
    }
}
