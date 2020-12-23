public class LeetCode556 {
    public int nextGreaterElement(int n) {
        String s = Integer.toString(n);

        int[] nums = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            nums[i] = s.charAt(i) - '0';
        }


        int len  = nums.length;
        if(len < 2){
            return -1;
        }

        int last = nums.length - 2;
        while (last >= 0) {
            if (nums[last] < nums[last + 1]) {
                break;
            }
            last--;
        }
        if (last < 0)
            return -1;

        int nextGreater = nums.length - 1;

        for (int i = nums.length - 1; i > last; i--) {
            if (nums[i] > nums[last]) {
                nextGreater = i;
                break;
            }
        }

        nums = swap(nums, nextGreater, last);

        nums = reverse(nums, last + 1, nums.length - 1);

        long ans =0;

        for(int i = 0; i < nums.length; i++){
            ans = 10*ans + nums[i];
        }

        if(ans > Integer.MAX_VALUE){
            return -1;
        }

        return (int)ans;

    }

    private int[] reverse(int data[], int left, int right)
    {
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }
        return data;
    }
    public int[] swap(int data[], int left, int right)
    {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        return data;
    }
}
