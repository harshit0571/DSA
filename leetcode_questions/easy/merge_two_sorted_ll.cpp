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















//java soln

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        
        temp.next= l1!=null ? l1:l2;
        return ans.next;
    }
}
