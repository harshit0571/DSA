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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        ListNode* temp=head;
        int diff=right-left;

        if(left==right){
            return head;
        }

        while(left>1){
            prev=temp;
            temp=temp->next;
            left--;
        }
        ListNode* temp2=head;
        while(right>1 && temp2->next!=NULL){
            temp2=temp2->next;
            curr=temp2->next;
            right--;
        }

        ListNode* p=NULL;
        ListNode* c=temp;
        ListNode* t=temp;

        while(diff>=0){
            cout<<t->val<<" ";
            t=t->next;
            c->next=p;
            p=c;
            c=t;
            diff--;
        }

        if(prev!=NULL){

            prev->next->next=curr;
            prev->next=p;
        }
        else{
            head->next=curr;
            return p;
        }
    
        return head;

        

    }


};
