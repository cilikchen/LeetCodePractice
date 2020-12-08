public class LeetCode45 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<= nums[i] && (i+j)<nums.length ;j++){
                if(dp[i+j] ==0){
                    dp[i+j] =dp[i]+1;
                }else{
                    dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
                }
            }
        }
        return dp[nums.length -1];
    }
}
