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
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp1=dummy;
        while(temp!=null){
            if(temp.next!=null  && temp.val==temp.next.val){
                int duplicate=temp.val;
                while( temp!=null&& temp.val==duplicate){
                    temp=temp.next;
                }
                
                temp1.next=temp;
            }else{
                temp=temp.next;
                 temp1=temp1.next;
            }
           
        }
        return dummy.next;
    }

}