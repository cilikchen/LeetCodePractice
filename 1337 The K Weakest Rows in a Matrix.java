class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int rowNum = mat.length;
        int[] soiderNum = new int[rowNum];

        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] ==1){
                    count++;
                }
            }
            soiderNum[i] = count;
        }

        List<Integer> list = new ArrayList<>();
        int currentCount=0;
        int currentPower=0;
        while (currentCount<k){
            for(int i=0;i<soiderNum.length;i++){
                if(soiderNum[i] == currentPower){
                    currentCount++;
                    list.add(i);
                    if(currentCount>=k){
                        break;
                    }
                }
            }
            currentPower++;
        }

        for(int i =0;i<k;i++){
            ans[i] = list.get(i);
        }


        return ans;
    }
}
