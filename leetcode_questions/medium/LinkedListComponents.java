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
    boolean contains(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public int numComponents(ListNode head, int[] arr) {
        ListNode temp=head;
        boolean flag=false;
        int count=0;

        while(temp!=null){
            if(contains(arr,temp.val)){
                if(temp.next==null){
                    count++;
                    return count;
                }
                flag=true;
                temp=temp.next;
                continue;
            }
            if(flag==true){
                System.out.println(temp.val + " "+ count);
                count++;
                flag=false;
            }
            temp=temp.next;
        }
        return count;
    }
}
