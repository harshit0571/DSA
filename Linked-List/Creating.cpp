// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next;
  
};

int main() {
    // Write C++ code here
    Node *node1=new Node();
    cout<<node1->data<<" "<<node1->next;

    return 0;
}
