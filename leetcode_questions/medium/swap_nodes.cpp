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
    ListNode* swapPairs(ListNode* head) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        ListNode* temp=head;
        int count=0;
        while(count<2 && curr!=NULL){
            temp=temp->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        if(temp!=NULL){
            head->next=swapPairs(temp);
        } 
        return prev;
    }
};
