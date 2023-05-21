/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int Length(ListNode *temp){
        int count=0;
        while(temp!=NULL){
            count++;
            temp=temp->next;
        }
        return count;
    }
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int a;
        int b;
        a=Length(headA);
        b=Length(headB);
        if(a>b){
            int c=a-b;
            while(c>0){
                headA=headA->next;
                c--;
            }
        }
        else{
            int c=b-a;
            while(c>0){
                headB=headB->next;
                c--;
            }
        }
        while(headA!=NULL){
            if(headA==headB){
                return headA;
            }
            headA=headA->next;
            headB=headB->next;
        }
        return NULL;

    }
};











/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int length(ListNode t){
        int count=0;
        while(t!=null){
            t=t.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=length(headA);
        int n2=length(headB);
        if(headA!=null && n1>n2){
            int t=n1-n2;
            while(t>0){
                headA=headA.next;
                t--;
            }
        }
        else{
            int t=n2-n1;
            while(t>0){
                headB=headB.next;
                t--;
            }
        }
        System.out.println(headA.val +" "+headB.val);
        while(headA !=null && headB!=null){
                if(headA==headB){
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
        }
        return null;
    }
}
