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
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==NULL || head->next==NULL){
            return head;
        }
        ListNode* temp=head;
        int count=0;
        while(temp!=NULL){
            temp=temp->next;
            count++;
        }
        int s=k%count;
        ListNode* s_last=find_last(head);
        ListNode* start=head;
        ListNode* last=s_last->next;
        while(s>0){
            s_last=find_last(start); 
            last=s_last->next;
            last->next=start;
            start=last;
            s_last->next=NULL; 
    s--;
        }
        return start;

    }
    ListNode* find_last(ListNode* temp){
        ListNode* temp1=temp;
        while(temp!=NULL && temp1->next!=NULL && temp1->next->next!=NULL){
            temp1=temp1->next;
        }
        return temp1;
    }
};
