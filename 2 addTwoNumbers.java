public class LeetCode2 {

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode temp = list;

        int cnt=0;
        while (l1!=null||l2!=null||cnt!=0){
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + cnt;
            int newNum = sum % 10;
            cnt = sum / 10;
            temp.next = new ListNode(newNum);
            temp = temp.next;

            l1 = l1 == null ? null: l1.next;
            l2 = l2 == null ? null: l2.next;

        }

        return list.next;

    }
}
