public class LeetCode775 {
    public boolean isIdealPermutation(int[] A) {
        int globalCnt = 0;
        int localCnt = 0;

        int n = A.length;

        for(int i = 0; i < n - 1; i++ ){
            if(A[i] > A[i+1]){
                localCnt++;
            }
        }
        for(int i = 0; i < n - 1; i++ ){
            for(int j = i+1; j< n; j++){
                if(A[i] > A[j]){
                    globalCnt++;
                }
            }
        }


        return globalCnt == localCnt;
    }

}
