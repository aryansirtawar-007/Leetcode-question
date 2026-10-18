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
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode l1=less;
        ListNode greater=new ListNode(0);
        ListNode g1=greater;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode a=new ListNode(temp.val);
                less.next=a;
                less=a;

            }
            else{

                ListNode a=new ListNode(temp.val);
                greater.next=a;
                greater=a;

            }
            temp=temp.next;
        }

        less.next=g1.next;
        return l1.next;

       
    }
}