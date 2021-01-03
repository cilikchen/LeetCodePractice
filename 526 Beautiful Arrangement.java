public class LeetCode526 {
    int ans =  0;
    public int countArrangement(int n) {

        boolean[] visited = new boolean[16];
            dfs(visited, 1 , n);

            return ans;

    }

    private void dfs(boolean[] visited, int current, int n){

        if(current == n+1){
            ans++;
            return;
        }

        for( int i = 1; i <= n; i ++){
            if(visited[i]){
                continue;
            }else{
                if(i % current ==0 || current % i ==0){
                    visited[i] = true;
                    dfs(visited, current + 1, n);
                    visited[i] = false;
                }

            }
        }

    }
}
