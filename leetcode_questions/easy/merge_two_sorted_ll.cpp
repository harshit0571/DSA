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
    ListNode* mergeTwoLists(ListNode* left, ListNode* right) {
        if(left==NULL){
            return right;
        }
        if(right==NULL){
            return left;
        }
        ListNode* ans= new ListNode(-1);
        ListNode* temp=ans;
        while(left!=NULL && right!=NULL){
            if(left->val < right->val){
                temp->next=left;
                left=left->next;
                temp=temp->next;
            }
            else{
                temp->next=right;
                right=right->next;
                temp=temp->next;          
            }
        }
        while(left!=NULL){
            temp->next=left;
            left=left->next;
            temp=temp->next;
        }
        while(right!=NULL){
            temp->next=right;
            right=right->next;
            temp=temp->next;
        }
        ans=ans->next;
        return ans;

    }
};
