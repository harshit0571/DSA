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
    public ListNode swapPairs(ListNode head) {
        ListNode one=head;
        ListNode two=head!=null? head.next: null;
        while(two!=null){
            System.out.println(one.val+" "+two.val);
            int temp=one.val;
            one.val=two.val;
            two.val=temp;
            one=one!=null && one.next!=null && one.next.next!=null ? one.next.next : null;
            two=two!=null && two.next!=null && two.next.next!=null ? two.next.next : null;
        }
        return head;
    }
}
