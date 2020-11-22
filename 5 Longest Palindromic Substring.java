import java.util.ArrayList;
import java.util.List;

public class LeetCode5 {
    /*
    public String longestPalindrome(String s) {
        int start =-1;
        int end =-1;
        int maxLength = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            list = calculate(s,i,i);
            if(maxLength < list.get(1) - list.get(0)+1){
                maxLength =list.get(1) - list.get(0)+1;
                start = list.get(0);
                end = list.get(1);
            }
            list = calculate(s,i,i+1);
            if(maxLength < list.get(1) - list.get(0)+1){
                maxLength =list.get(1) - list.get(0)+1;
                start = list.get(0);
                end = list.get(1);
            }
        }
        return s.substring(start,end+1);
    }
    private List<Integer> calculate(String s, int index1, int index2){
        List<Integer> list = new ArrayList<>();
        while (index1>=0 && index2<s.length()){
            if(s.charAt(index1)!= s.charAt(index2)){
                break;
            }
            index1--;
            index2++;
        }
        list.add(index1+1);
        list.add(index2-1);
        return list;
    }*/

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
