import java.util.*;
public class LeetCode902 {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        if(n==0){
            return 0;
        }
        int ans =0;
        List<Integer> list = new ArrayList<>();
        while (n>0){
            list.add(n%10);
            n=n/10;
        }
        for(int i=1;i<list.size();i++){
            ans+=(int) Math.pow(digits.length, i);
        }
        Arrays.sort(digits);
        ans += func(digits,list);
        return ans;

    }

    private int func(String[] digit, List<Integer> list){
        int smallerCnt =0;
        int equalCnt =0;
        int currentNum = list.get(list.size()-1);
        for(int i=0;i< digit.length;i++){
            if(Integer.parseInt(digit[i]) < currentNum){
                smallerCnt++;
            }else if(Integer.parseInt(digit[i]) == currentNum){
                equalCnt++;
            }
        }
        if(list.size()==1){
            return smallerCnt+equalCnt;
        }
        if(equalCnt ==0){
            return smallerCnt * (int) Math.pow(digit.length, list.size()-1);
        }else {
            list.remove(list.size()-1);
            return (smallerCnt * (int) Math.pow(digit.length, list.size())) + func(digit,list);
        }


    }
}
