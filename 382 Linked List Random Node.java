import java.util.*;
import java.util.concurrent.*;

public class LeetCode382 {
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

    /**
     * @param head The linked list's head.
     * Note that the head is guaranteed to be not null, so it contains at least one node.
     */

    ArrayList<Integer> list = new ArrayList<>();

    public void Solution(ListNode head) {

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, list.size());
        return list.get(randomNum);

    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(head);
     * int param_1 = obj.getRandom();
     */

}
