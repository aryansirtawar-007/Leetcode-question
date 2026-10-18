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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;

       
          int cary=0;
          while(temp1!=null || temp2!=null || cary!=0){
            int x;
            if(temp1!=null){
                x=temp1.val;

            }else{
                x=0;
            }
            int  y;
            if(temp2!=null){
                y=temp2.val;
            }else{
                y=0;

            }
            int sum=x+y+cary;
            int digit=sum%10;
            cary=sum/10;
            ListNode newNode=new ListNode(digit);
            temp.next=newNode;
            temp=temp.next;
            if(temp1!=null){
                temp1=temp1.next;
            }

            if(temp2!=null){
                temp2=temp2.next;
            }
          }

          return dummy.next;

         

        
    }
}