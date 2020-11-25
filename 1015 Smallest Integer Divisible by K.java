public class LeetCode1015 {
    public int smallestRepunitDivByK(int K) {
        int reminder = 1%K;

        for(int N=1; N<=K;N++){
            if(reminder ==0) return N;
            reminder = (reminder*10 +1)%K;
        }

        return -1;

    }
}
