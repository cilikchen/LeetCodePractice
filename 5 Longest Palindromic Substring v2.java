import java.util.ArrayList;
import java.util.List;

public class LeetCode5 {
    
    public String longestPalindrome(String s) {
        int start =-1;
        int end =-1;
        int maxLength = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            list = calculate(s,i,i);
            if(maxLength < list.get(1) - list.get(0)+1){
                maxLength =list.get(1) - list.get(0)+1;
                start = list.get(0);
                end = list.get(1);
            }
            list = calculate(s,i,i+1);
            if(maxLength < list.get(1) - list.get(0)+1){
                maxLength =list.get(1) - list.get(0)+1;
                start = list.get(0);
                end = list.get(1);
            }
        }
        return s.substring(start,end+1);
    }
    private List<Integer> calculate(String s, int index1, int index2){
        List<Integer> list = new ArrayList<>();
        while (index1>=0 && index2<s.length()){
            if(s.charAt(index1)!= s.charAt(index2)){
                break;
            }
            index1--;
            index2++;
        }
        list.add(index1+1);
        list.add(index2-1);
        return list;
    }
}
