import java.util.Stack;

public class LeetCodeBiweekly39B {//5551
    public int minimumDeletions(String s) {
        int len = s.length();
        int cnt=0;
        boolean[] deleted = new boolean[len];

        for(int i=0;i<len;i++){
            if(s.charAt(i) =='b'){
                for(int j=i+1;j<len;j++){
                    if(s.charAt(j)=='a' && !deleted[j]){
                        deleted[j]=true;
                        cnt++;
                        break;
                    }
                }
            }
        }

        return cnt;
    }
}
