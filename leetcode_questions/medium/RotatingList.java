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
            count++;
            temp=temp.next;
        }
        return count;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    ListNode findLast(ListNode head){
        ListNode last=head;
        while(last!=null && last.next!=null){
            last=last.next;
        }
        return last;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int c=k%length(head);
        ListNode rev=reverse(head);
        ListNode tempHead=rev;
        while(c>0){
            ListNode last=findLast(head);
            ListNode temp=tempHead;
            last.next=temp;
            tempHead=tempHead.next;
            temp.next=null;
            c--;
        }
        return reverse(tempHead);

        // 5 4 3 2 1
        // 4 5 1 2 3
        // 3 2 1 5 4
        // 4 5 1 2 3
    }
}
