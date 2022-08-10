#include <iostream>

using namespace std;

class Node{
    public:
    int data;
    Node *next;
    Node *prev;
    Node(int data){
        this -> data=data;
        next = NULL;
        prev = NULL;
    }
};
Node *inserting_head(Node *head , int data){
    Node *newNode = new Node(data);
    newNode -> next = head;
    head -> prev = newNode;
    head = newNode;
    return head;
}
Node *inserting(Node *head,int data ,int i){
    Node *newNode =new Node(data);
    if(i == 0){
    newNode -> next = head;
    head -> prev = newNode;
    head = newNode;
    return head;
    }
    int count =0;
    Node *temp = head;
    while(temp != NULL && count<i-1){
        temp =temp ->next;
        count ++;
    }
    if(temp !=NULL){
        newNode -> next = temp->next;
        newNode -> prev =temp;
        Node *a= temp -> next;
        Node *b = a;
        temp ->next = newNode;
        b -> prev = newNode;
    }
    return head;
}
void print(Node *head){
    Node *temp = head;
    while(temp != NULL){
        cout<<temp -> data<<" ";
        temp = temp -> next;
    }
}
int main()
{
    Node *n = new Node(10);
    Node *head =inserting_head(n,20);
    // print(head);
    head= inserting(head,3,1);
    print(head);
}
