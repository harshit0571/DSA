// Online C++ compiler to run C++ program online
#include <iostream>
#include <bits/stdc++.h>
using namespace std;


class Node{
    public:
    int data;
    Node* left;
    Node* right;
    Node(int d){
        data=d;
        this->left=NULL;
        this->right=NULL;
    }
};
void LevelOrder(Node* root){
    queue<Node*> Q;
    Node* temp=root;
    Q.push(temp);
    while(!Q.empty()){
        temp=Q.front();
        Q.pop();
        cout<<temp->data<<" ";
        if(temp->left){
            Q.push(temp->left);
        }
        if(temp->right){
            Q.push(temp->right);
        }
    }
}
void preorder(Node* root){
    if(root==NULL){
        return;
    }
    cout<<root->data;
    preorder(root->left);
    preorder(root->right);
}
void inorder(Node* root){
    if(root==NULL){
        return;
    }
    inorder(root->left);
    cout<<root->data;
    inorder(root->right);    
}
void postorder(Node* root){
    if(root==NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right); 
        cout<<root->data;

}
Node* InsertIntoBST(Node* root, int data){
    if(root==NULL){
        root=new Node(data);
        return root;
    }
    if(data>root->data){
        root->right=InsertIntoBST(root->right, data);
    }
    else if(data<root->data){
        root->left=InsertIntoBST(root->left, data);
    }
    return root;    
}
void TakeInput(Node* &root,int n){
    int data;
    while(n>0){
        cin>>data;
        root=InsertIntoBST(root, data);
        n--;
    }
}
