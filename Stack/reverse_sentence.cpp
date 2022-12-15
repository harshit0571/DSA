#include <iostream>
#include <bits/stdc++.h>
#include <vector> 
#include <stack>
#include <string>
#include <queue>
using namespace std;
void reverse(string s){
    stack<string> stk;
    string word="";
    for(int i=0;i<s.length();i++){
        if(s[i]!=' '){
            word+=s[i];
        }
        else{
            stk.push(word);
            word="";
        }
    }
    stk.push(word);
    while(!stk.empty()){
        cout<<stk.top()<<" ";
        stk.pop();
    }
}
int main(){
    string s="hello everyone";
    reverse(s);
}
