// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
#include <bits/stdc++.h>
void reverse_sentence(string s){
    stack<string> stk;
    string word="";
    for(int i=0;i<s.length();i++){
        if(s[i]!=' ' && i<s.length()-1){
            word+=s[i];
   
        }
        else{
            cout<<word<<" ";
            stk.push(word);
            word="";
        }
    }
    while(!stk.empty()){
        // cout<<stk.top()<<" ";
        stk.pop();
    }
}
int main() {
    string s;
    s="hello everyone";
    reverse_sentence(s);
}
