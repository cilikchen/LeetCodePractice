public class LeetCodeBiweekly43A {
    public int totalMoney(int n) {
        int ans =0;
        int i = 1;
        int k = 0;

        while ( i + 7*k <= n){
            if(i %7 ==0){
                ans += 7 + k;
                i=1;
                k++;
            }else{
                ans+= i + k;
                i++;
            }

        }

        return ans;
    }
}
