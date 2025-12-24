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
    public ListNode middleNode(ListNode head) {
        
        ListNode pre=head ;
        ListNode temp =head;
        if(head.next==null){
            return pre;
        }if(head.next.next==null){
            return pre.next;
        }

        while(temp.next!=null && temp.next.next!= null){
                
            pre=pre.next;
            temp=temp.next.next;
            if(temp.next==null){
                    return pre;
                }
            else if(temp.next.next==null){
                return pre.next;
            }
                
        }
        return pre;
    }
}