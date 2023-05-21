/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=-1;
        HashMap<ListNode, Integer> map=new HashMap<>();
        while(slow!=null){
            count++;
            if(map.containsKey(slow)){
                return slow;
            }
            else{
                map.put(slow, count);
            }
            slow=slow.next;
        }
        return null;
    }
}
