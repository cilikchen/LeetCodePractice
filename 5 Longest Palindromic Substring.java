import java.util.ArrayList;
import java.util.List;

public class LeetCode5 {
    public String longestPalindrome(String s) {
        if(s.length() ==1){
            return s;
        }
        int right =-1;
        int left =-1;
        int maxLen = Integer.MIN_VALUE;
        boolean[][] dp = new boolean[s.length()][s.length()];
        dp[0][0] = true;
        for (int i = 1; i < s.length(); i++) {
            int k=0;
            dp[i][i] = true;
            while (i-k>=0 && i+k < s.length()){
                if(s.charAt(i-k) == s.charAt(i+k)){
                    dp[i-k][i+k] = true;
                    if( maxLen < 2*k+1){
                        maxLen = 2*k+1;
                        right = i+k;
                        left=i-k;
                    }
                    k++;
                }else{
                    break;
                }
            }
            if (s.charAt(i) == s.charAt(i - 1)) {
                k=0;
                dp[i - 1][i] = true;
                while (i-1-k>=0 && i+k < s.length()){
                    if(s.charAt(i-k-1) == s.charAt(i+k)){
                        dp[i-k][i+k] = true;
                        if( maxLen < 2*k+2){
                            maxLen = 2*k+2;
                            right = i+k;
                            left=i-1-k;
                        }
                        k++;
                    }else{
                        break;
                    }
                }
            }
        }
        return s.substring(left, right+1);
    }

}
