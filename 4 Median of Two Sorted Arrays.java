import java.util.ArrayList;
import java.util.List;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        list.sort(Integer::compareTo);
        int n = list.size();
        if(n%2==0){
            ans = (list.get(n/2) + list.get(n/2-1)) /2.0;
        }else {
            ans = list.get(n/2)/1.0;
        }
        return ans;
    }
}
