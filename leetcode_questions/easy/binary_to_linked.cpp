/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) {
        ListNode* temp=Reverse(head);
        int count=0;
        int sum=0;
        while(temp!=NULL){
            sum+=temp->val*(pow(2, count));
            count++;
            temp=temp->next;
        }
        return sum;
    }
    ListNode* Reverse(ListNode* temp){
        if(temp==NULL){
            return temp;
        }
        ListNode* prev=NULL;
        ListNode* curr=temp;
        ListNode* extra=NULL;
        while(curr!=NULL){
            extra=curr->next;
            curr->next=prev;
            prev=curr;
            curr=extra;
        }
        return prev;
    }
};
