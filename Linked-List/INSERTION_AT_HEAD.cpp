#include <iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next;
  Node(int data){
      this->data=data;
      this->next=NULL;
  }
};

void insertAtHead(Node* &head, int val){
    Node* temp=new Node(val); 
    temp->next=head;
    head=temp;
}

int main() {
    // Write C++ code here
    Node *node1=new Node(10);// initializing data 
    // cout<<node1->data<<" "<<node1->next;
    Node *head=node1;
    insertAtHead(head, 43);
    cout<<head->data<<" "<<head->next;
    return 0;
}
