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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(-1111);
        temp.next = head;
        ListNode pre = temp;
        ListNode current = head;

        while (current != null){
            while (current.next != null && current.next.val == current.val){
                current = current.next;
            }
            if(pre.next == current){
                pre = pre.next;
            }else {
                pre.next = current.next;
            }
            current = current.next;
        }
        
        return temp.next;
    }
}
