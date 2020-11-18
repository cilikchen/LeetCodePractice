import java.util.*;
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int value = target -nums[i];
            if(list.indexOf(value)!=-1 && list.indexOf(value)!=i){
                ans[0]=i;
                ans[1]= list.indexOf(value);
                break;
            }
        }
        return ans;
    }
}
