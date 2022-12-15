#include <iostream>
#include <bits/stdc++.h>
#include <vector> 
#include <stack>
#include <string>
#include <queue>
using namespace std;
class Node{
    public:
    int data;
    Node* left;
    Node* right;

    Node(int d){
        this->data = d;
        this->left = NULL;
        this->right = NULL;
    }
};
Node* insertintoBST(Node* &root,int d){
    if(root == NULL){
        root = new Node(d);
        return root;
    }
    if(d>root->data){
        root->right = insertintoBST(root->right,d);
    }
    else{
        root->left = insertintoBST(root->left,d);
    }
    return root;
}
void takinginput(Node* &root,int n){
    int data;
    while(n>0){
        cin>>data;
        insertintoBST(root,data);
        n--;
    }
}
void preorder(Node* root){
    if(root ==NULL){
        return;
    }
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
void inorder(Node* root){
    if(root ==NULL){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}
void postorder(Node* root){
    if(root ==NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}
void levelorder(Node* root){
    queue<Node*>q;
    q.push(root);
    while(!q.empty()){
        Node* temp = q.front();
        cout<<temp -> data<<" ";
        q.pop();
        if(temp->left){
            q.push(temp->left);
        }
        if(temp->right){
            q.push(temp->right);
        }
    }
}
int main(){
    int n;
    cin >>n;
    Node* root =NULL;
    takinginput(root,n);
    cout<<"preorder : ";
    preorder(root);
    cout<<endl;
    cout<<"inorder : ";
    inorder(root);
    cout<<endl;
    cout<<"postorder : ";
    postorder(root);
    cout<<endl;
    cout<<"levelorder : ";
    levelorder(root);
    cout<<endl;
}
