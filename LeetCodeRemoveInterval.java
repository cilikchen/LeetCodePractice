import java.util.*;
public class LeetCodeRemoveInterval {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);

        int low = toBeRemoved[0];
        int high = toBeRemoved[1];

        List<List<Integer>> ans = new ArrayList<>();
        for (int[] i : intervals) {
            if(low<i[0]){
                if(high<=i[0]){
                    Integer[] spam = new Integer[] { i[0],i[1] };
                    List<Integer> list = Arrays.asList(spam);
                    ans.add(list);
                }else{
                    if(high<i[1]){
                        Integer[] spam = new Integer[] { high,i[1] };
                        List<Integer> list = Arrays.asList(spam);
                        ans.add(list);
                    }else{
                        continue;
                    }
                }
            }else if(low ==i[0]){
                if(high<i[1]){
                    Integer[] spam = new Integer[] { high,i[1] };
                    List<Integer> list = Arrays.asList(spam);
                    ans.add(list);
                }else{
                    continue;
                }
            }else{
                if(low>=i[1]){
                    Integer[] spam = new Integer[] { i[0],i[1] };
                    List<Integer> list = Arrays.asList(spam);
                    ans.add(list);
                }else{
                    if(high<i[1]){
                        Integer[] spam = new Integer[] { i[0],low };
                        List<Integer> list = Arrays.asList(spam);
                        ans.add(list);
                        spam = new Integer[] { high,i[1] };
                        list = Arrays.asList(spam);
                        ans.add(list);
                    }else{
                        Integer[] spam = new Integer[] { i[0],low };
                        List<Integer> list = Arrays.asList(spam);
                        ans.add(list);
                    }
                }
            }

        }


        return ans;
    }
}
