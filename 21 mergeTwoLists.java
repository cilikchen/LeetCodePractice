public class LeetCode21 {

     private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode list = new ListNode();

         ListNode temp =list;

         while (l1!=null||l2!=null){
             if(l1!=null&&l2!=null){
                 if(l1.val >l2.val){
                     temp.next =l2;
                     l2=l2.next;
                 }else{
                     temp.next=l1;
                     l1=l1.next;
                 }
             }else if (l1 == null) {
                 temp.next = l2;
                 l2 = l2.next;
             } else if (l2 == null) {
                 temp.next = l1;
                 l1 = l1.next;
             }
             temp = temp.next;

         }


         return list.next;
    }
}
