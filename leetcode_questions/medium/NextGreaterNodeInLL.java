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
        ListNode t=head;
        int count=0;
        while(t!=null){
            t=t.next;
            count++;
        }
        return count;
    }
    public int[] nextLargerNodes(ListNode head) {
        int n=length(head);
        int[] arr=new int[n];
        ListNode temp=head;
        for(int i=0;i<n;i++){
            ListNode t=temp;
            int val=temp.val;
            int max=0;
            while(t!=null){
                if(t.val>val){
                    max=t.val;
                    break;
                }
                t=t.next;
            }
            arr[i]=max;
            temp=temp.next;
        }
        return arr;
    }
}
