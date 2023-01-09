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
    bool isPalindrome(ListNode* head) {
        stack<ListNode*> stk;
        ListNode* temp=head;
        while(temp!=NULL){
            stk.push(temp);
            temp=temp->next;
        }
        temp=head;
        while(temp!=NULL){
            if(stk.top()->val==temp->val){
                stk.pop();
                temp=temp->next;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    // ListNode* Reverse(ListNode* temp){
    //     ListNode* prev=NULL;
    //     ListNode* curr=temp;
    //     ListNode* extra=NULL;
    //     if(temp==NULL){
    //         return NULL;
    //     }
    //     else{
    //         while(curr!=NULL){
    //             temp=curr->next;
    //             curr->next=prev;
    //             prev=curr;
    //             curr=temp;
    //         }
    //         return prev;
    //     }
    // }
};
