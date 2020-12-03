import java.util.*;

public class LeetCode23 {

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                list.add(current.val);
                current = current.next;
            }
        }
        Collections.sort(list);
        ListNode head = new ListNode();
        if (list.size() != 0) {
            head.val = list.get(0);
        } else {
            return null;
        }
        ListNode temp = head;

        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return head;
    }

}
