/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        int i =1;
        while (i<n){
            for(int k=0; k< n-i ;k+=2*i ){
                lists[k] = merge(lists[k], lists[k+i]);
            }
            i *= 2;
        }
        
        if(lists.length ==0){
            return null;
        }else{
            return lists[0];
        }
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode point = head;
        while (l1!=null && l2!=null){
            if(l1.val <= l2.val){
                point.next = l1;
                l1 = l1.next;
            }else{
                point.next = l2;
                l2 = l1;
                l1= point.next.next;
            }
            point = point.next;
        }
        if(l1==null){
            point.next = l2;
        }else{
            point.next = l1;
        }
        return head.next;
    }

}
