class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans = 0;
        int start = 1;
        for(int i =0; i < arr.length; i++){
            while(start != arr[i]){
                ans++;
                if(ans ==k){
                    return start;
                }
                start++;
                
            }
            start++;
        }
        
        return start + (k - ans -1);
    }
}
