import java.util.*;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int height = nums.length - 1;
                int sum = 0 - nums[i];
                while (low < height) {
                    if (nums[low] + nums[height] == sum) {
                        ans.add(Arrays.asList(nums[i], nums[low], nums[height]));
                        low++;
                        height--;
                        while (low < height && (nums[low] == nums[low - 1])) {
                            low++;
                        }
                        while (low < height && (nums[height] == nums[height + 1])) {
                            height--;
                        }
                    } else if (nums[low] + nums[height] > sum) {
                        height--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return ans;
    }
}
