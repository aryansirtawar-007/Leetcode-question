/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int length1=0;
        int length2=0;
        ListNode temp1=head1;
        ListNode temp2=head2;
        while(temp1!=null){
            length1++;
            temp1=temp1.next;
        }
        temp1=head1;
         while(temp2!=null){
            length2++;
            temp2=temp2.next;
        }
        temp2=head2;

        if(length1>length2){
            int num=length1-length2;
            for(int i=0;i<num;i++){
                temp1=temp1.next;
            }
        }else{
             int num=length2-length1;
            for(int i=0;i<num;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1;


        

        
    }
}