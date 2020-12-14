import java.util.ArrayList;
import java.util.List;

public class LeetCodeBiweekly40B {

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        List<Integer> mainList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();

        ListNode curr1 = list1;
        ListNode curr2 = list2;


        while (curr1!=null){
            mainList.add(curr1.val);
            curr1 = curr1.next;
        }

        while (curr2!=null){
            subList.add(curr2.val);
            curr2 = curr2.next;
        }

        for(int i=0;i<a;i++){
            ansList.add(mainList.indexOf(i));
        }
        for(int i=0;i<a;i++){
            mainList.remove(0);
        }
//        for(int i = 0; i< subList.size(); i++){
//            ansList.add(subList.indexOf(i));
//        }
        ansList.addAll(subList);
        ansList.addAll(subList);

//        List<Integer> subList2 = new ArrayList<>();
//        for(int i = b; i< mainList.size(); i++){
//            subList2.add(subList.indexOf(i));
//        }
//        ansList.addAll(subList2);

        ListNode finalList = new ListNode(ansList.get(0));
        ListNode dummy = finalList;

        for(int i = 1; i< ansList.size(); i++){
            ListNode temp = new ListNode(ansList.get(i));
            dummy.next =temp;
            dummy = temp;
        }


        return finalList;

    }
}
