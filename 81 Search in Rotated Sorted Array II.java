public class LeetCode81 {
    public boolean search(int[] nums, int target) {
        int head = nums.length;
        int tail =0;

        while (tail < head){
            int mid =(head + tail)/2 ;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > nums[tail]){
                if(target >=nums[tail] && target <nums[mid]){
                    head = mid;
                }else{
                    tail = mid+1;
                }
            }else if(nums[mid] < nums[tail]){
                if (target > nums[mid] && target < nums[tail]){
                    tail = mid+1;
                }else{
                    head = mid;
                }
            }else{
                tail++;
            }

        }
        return  false;



/*
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;

        */
    }
}
