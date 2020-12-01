public class LeetCode243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int case1 =-1, case2 =-1;

        int ans = Integer.MAX_VALUE;


        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                case1 = i;

            }
            if(words[i].equals(word2)){
                case2 = i;

            }
            if(case1!=-1&&case2!=-1){
                ans = Math.min(ans, Math.abs(case1-case2));
            }
        }

        return ans;
    }
}
