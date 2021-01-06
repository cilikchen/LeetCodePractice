public class LeetCode560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = nums[start];
            if(sum == k){
                count++;
            }
            for (int end = start + 1; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k){
                    count++;

                }

            }


        }
        return count;
    }
}
