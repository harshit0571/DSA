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
