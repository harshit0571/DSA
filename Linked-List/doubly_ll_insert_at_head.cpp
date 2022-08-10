#include <iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next;
  Node *prev;
  Node(int data){
      this->data=data;
      this->next=NULL;
      this->prev=NULL;
  }
};

void insertAtHead(Node* &node1,Node* &head, int val){
    Node* temp=new Node(val); 
    temp->next=node1;
    head=temp;
    node1->prev=head;
}
void print_ll(Node* &head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
int main() {
    // Write C++ code here
    Node *node1=new Node(10);// initializing data 
    // cout<<node1->data<<" "<<node1->next;
    Node *head=node1;
    insertAtHead(node1,head, 43);
    print_ll(head);
    return 0;
}
