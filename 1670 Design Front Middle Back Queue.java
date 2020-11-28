import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class LeetCodeBiweekly40C {

    ArrayList<Integer> list = new ArrayList<>();

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        list.add(0,val);

    }

    public void pushMiddle(int val) {
        int n = list.size();

            list.add(n/2,val);


    }

    public void pushBack(int val) {
        list.add(val);

    }

    public int popFront() {
        if(list.isEmpty()){
            return -1;
        }
        int ans= list.get(0);
        list.remove(0);
        return ans;


    }

    public int popMiddle() {
        if(list.isEmpty()){
            return -1;
        }
        int n = list.size();
        int ans =0;

        ans = list.get((n-1)/2);
        list.remove((n-1)/2);


        return ans;
    }

    public int popBack() {
        if(list.isEmpty()){
            return -1;
        }
        int ans = list.get(list.size()-1);
        list.remove(list.size()-1);
        return ans;

    }
}
