import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LeetCode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        if(A.length == 0 || B.length == 0|| C.length ==0 || D.length ==0){
            return 0;
        }

        int ans = 0;
        Map<Integer, Integer> mapA = new TreeMap<>();
        TreeMap<Integer, Integer> mapB = new TreeMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                mapA.put((A[i] + B[j]), mapA.getOrDefault((A[i] + B[j]), 0) + 1);
            }
        }
        for (int i : C) {
            for (int j : D) {
                mapB.put(i + j, mapB.getOrDefault(i + j, 0) + 1);
            }
        }
        Map<Integer, Integer> reverseB = mapB.descendingMap();
        Iterator<Map.Entry<Integer, Integer>> iteratorA = mapA.entrySet().iterator();
        Iterator<Map.Entry<Integer, Integer>> iteratorB = reverseB.entrySet().iterator();

        Map.Entry<Integer, Integer> currentA = iteratorA.next();
        Map.Entry<Integer, Integer> currentB = iteratorB.next();
        while (true) {
            if(currentA.getKey() + currentB.getKey() == 0){
                ans+= currentA.getValue() * currentB.getValue();
                if(iteratorA.hasNext()){
                    currentA =iteratorA.next();
                } else {
                    break;
                }
                if(iteratorB.hasNext()){
                    currentB =iteratorB.next();
                } else {
                    break;
                }



            }else if (currentA.getKey() + currentB.getKey() > 0){
                if(iteratorB.hasNext()){
                    currentB =iteratorB.next();
                } else {
                    break;
                }
            }else{
                if(iteratorA.hasNext()){
                    currentA =iteratorA.next();
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}
