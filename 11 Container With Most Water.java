public class LeetCode11 {
    public int maxArea(int[] height) {
        int ans =Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;

        while (i<j){
            ans = Math.max(ans, Math.min(height[i], height[j]) * (j-i));
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
