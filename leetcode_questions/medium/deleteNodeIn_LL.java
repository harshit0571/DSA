/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        while(temp.next!=null){
            int n=temp.val;
            temp.val= temp.next.val;
            temp.next.val=n;
            if(temp.next.next==null){
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
    }
}




//O(1);

        node.val=node.next.val;
        node.next=node.next.next;

