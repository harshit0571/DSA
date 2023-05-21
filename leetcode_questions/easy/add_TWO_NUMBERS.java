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
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        int carr=0;
        while(l1!=null || l2!=null || carr>0){
            int sum=(l1!=null ? l1.val:0) + (l2!=null ? l2.val:0) +carr;
            if(sum>9){
                sum=sum%10;
                carr=1;
            }
            else{
                carr=0;
            }
            temp.next=new ListNode(sum);
            temp=temp.next;
            l1=l1!=null ? l1.next:null;
            l2=l2!=null ? l2.next:null;             
        }
        return ans.next;
    }
}
