public class LeetCode19 {
    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode first = temp;
        ListNode second = temp;

        int i=0;

        while (i<=n){
            first = first.next;
            i++;
        }

        while (first!= null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return temp.next;

    }
}
