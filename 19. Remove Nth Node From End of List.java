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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(size==n){
            return head.next;
        }
        int idxSearch=size-n;
        int i=1;
        ListNode prev=head;
        while(i<idxSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}