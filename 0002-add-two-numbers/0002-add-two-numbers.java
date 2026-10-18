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
          while(l1!=null || l2!=null || cary!=0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            
            int sum=x+y+cary;
            int digit=sum%10;
            cary=sum/10;
            ListNode newNode=new ListNode(digit);
            temp.next=newNode;
            temp=temp.next;
            if(l1!=null){
                l1=l1.next;
            }

            if(l2!=null){
                l2=l2.next;
            }
          }

          return dummy.next;

         

        
    }
}