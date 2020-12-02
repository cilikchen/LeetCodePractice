import java.util.ArrayList;
import java.util.*;
import java.util.Map;
import java.util.concurrent.*;

public class LeetCode398 {
    Map<Integer, List<Integer>> map;
    public void Solution(int[] nums) {
        int n =nums.length;
        this.map = new HashMap<Integer, List<Integer>>();
        for(int i = 0; i < n; i++){
            if(!this.map.containsKey(nums[i])){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                this.map.put(nums[i], temp);
            }else{
                this.map.get(nums[i]).add(i);
            }
        }

    }

    public int pick(int target) {
        int n = map.get(target).size();

        return map.get(target).get(ThreadLocalRandom.current().nextInt(0, n));


    }
}
