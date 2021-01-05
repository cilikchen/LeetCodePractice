class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowN = new HashSet<>();
        Set<Integer> colN = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rowN.add(i);
                    colN.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rowN.contains(i) || colN.contains(j)){
                    matrix[i][j] =0;
                }
            }
        }
    }
}
