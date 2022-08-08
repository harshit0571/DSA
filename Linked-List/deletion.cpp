#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node(int data){
        this->data=data;
    }
    ~Node(){
        int value=this->data;
        if(this->next!=NULL){
            
        }
    }
};
void InsertAtTail(Node* &tail, int n){
    Node *temp=new Node(n);
    tail->next=temp;
    tail=temp;
}
void InsertAtPosition(Node* &head, int p, int n){
    Node *temp=head;
    int count=1;
    while(count<=p-1){
        temp=temp->next;
        count++;
    }
    if(temp->next==NULL){
        InsertAtTail(head, n);
    }
    Node* New=new Node(n);
    New->next=temp->next;
    temp->next=New;
}
void print(Node* &head){
    Node*temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
void delete_node(Node * &head, int n){
    int count=1;
    Node * temp=head;
    while(count<n){
        temp=temp->next;
        count++;
    }
    
}
int main() {
    Node* head=new Node(10);
    Node * tail=head;
    InsertAtTail(tail, 50);
    InsertAtTail(tail, 100);
    InsertAtPosition(head, 2, 150);
    print(head);
    return 0;
}
