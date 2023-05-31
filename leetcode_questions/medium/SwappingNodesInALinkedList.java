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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode F=head;
        ListNode L=head;
        int n1=k;
        int n2=length(head) - k+1;
        while(n1>1){
            F=F.next;
            n1--;
        }
        while(n2>1){
            L=L.next;
            n2--;
        }
        System.out.println(F.val+" "+L.val);
        int temp=F.val;
        F.val=L.val;
        L.val=temp;
        return head;

    }
}
