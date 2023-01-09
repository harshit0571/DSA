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
    ListNode* partition(ListNode* head, int x) {
        ListNode* right=new ListNode(0);
        ListNode* left=new ListNode(0);
        ListNode* p1=right;
        ListNode* p2=left;
        ListNode* temp=head;
        while(temp!=NULL){
            if(temp->val<x){
                p1->next=temp;
                p1=p1->next;
                temp=temp->next;
            }
            else if(temp->val>=x){
                p2->next=temp;
                p2=p2->next;
                temp=temp->next;
            }
        }
        p2->next=NULL;
        p1->next=left->next;
        return right->next;
    }
};





// ListNode *partition(ListNode *head, int x) {
//     ListNode node1(0), node2(0);
//     ListNode *p1 = &node1, *p2 = &node2;
//     while (head) {
//         if (head->val < x)
//             p1 = p1->next = head;
//         else
//             p2 = p2->next = head;
//         head = head->next;
//     }
//     p2->next = NULL;
//     p1->next = node2.next;
//     return node1.next;
// }
