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
    int length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    ListNode revKGroup(ListNode head, int k,int length){
        if(length<k){
            return head;
        }
        int count=0;
        ListNode prev=null; 
        ListNode curr=head;
        ListNode temp=null;
        while(count<k && curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        if(temp!=null){
            head.next=revKGroup(temp, k, length-k);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int l=length(head);
        System.out.println(l);
        return revKGroup(head, k, l);
    }
}
