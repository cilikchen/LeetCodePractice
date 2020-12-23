class Solution {
    public void nextPermutation(int[] nums) {
        int len  = nums.length;
        if(len < 2){
            return;
        }

        int last = nums.length - 2;
        while (last >= 0) {
            if (nums[last] < nums[last + 1]) {
                break;
            }
            last--;
        }
        
        if(last >= 0){
           int nextGreater = nums.length - 1;

        for (int i = nums.length - 1; i > last; i--) {
            if (nums[i] > nums[last]) {
                nextGreater = i;
                break;
            }
        }

        nums = swap(nums, nextGreater, last); 
        }

        

        nums = reverse(nums, last + 1, nums.length - 1);



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
