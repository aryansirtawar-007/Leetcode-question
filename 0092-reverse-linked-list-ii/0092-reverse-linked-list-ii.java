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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode prev=dummy;

        int i=1;
        while(i<left){
           prev=prev.next;
           i++;
        }
        ListNode curr=prev.next;
        for(int j=0;j<right-left;j++){
            ListNode after=curr.next;
            curr.next=after.next;
            after.next=prev.next;
            prev.next=after;
        }
        
        return dummy.next;
        
    }
}