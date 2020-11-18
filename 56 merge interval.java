import java.util.*;
public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0] ,b[0]));
        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0] <= currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }else{
                ans.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        ans.add(currentInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
