// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node(int data){
        this->data=data;
    }
};
void InsertAtTail(Node* &tail, int n){
    Node *temp=new Node(n);
    tail->next=temp;
    tail=temp;
}
void print(Node* &head){
    Node*temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
int main() {
    Node* head=new Node(10);
    Node * tail=head;
    InsertAtTail(tail, 50);
    print(head);
    return 0;
}
