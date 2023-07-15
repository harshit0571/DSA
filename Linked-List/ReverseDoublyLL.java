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
    ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode temp=curr;
        while(curr!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        ListNode temp=rev(head);
        int ans=0;
        int count=0;
        while(temp!=null){
            ans=ans+(int)(Math.pow(2, count))*temp.val;
            temp=temp.next;
            count++;
        }
        return ans;
    }
}
