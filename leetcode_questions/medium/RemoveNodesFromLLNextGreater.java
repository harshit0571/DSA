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
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=curr;
        while(curr!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode temp=rev(head);
        int max=0;
        ListNode ans=new ListNode(-1);
        ans.next=temp;
        ListNode a=ans;
        while(temp!=null){
            max=Math.max(max, temp.val);
            if(temp.val>=max){
                ans.next=new ListNode(temp.val);
                ans=ans.next;
            }
            temp=temp.next;
        }
        return rev(a.next);
    }
}
