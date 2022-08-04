
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

int main() {
    // Write C++ code here
    Node *node1=new Node(10);// initializing data 
    cout<<node1->data<<" "<<node1->next;

    return 0;
}
