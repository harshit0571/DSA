// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
#include <bits/stdc++.h>



int CheckPrec(char c){
    if(c=='^'){
        return 3;
    }
    else if(c=='*' || c=='/'){
        return 2;
    }
    else if(c=='+' || c=='-'){
        return 1;
    }
    else if(c>='a' && c<='z' || c>='A' && c<='Z'){
        return 0;
    }
    else{
        return -1;
    }
}

string InfixTOpostfix(string S){
    stack<char> stk;
    int prec;
    string final="";
    for(int i=0;i<S.length();i++){
        prec=CheckPrec(S[i]);
        if(prec==0){
           final+=S[i];
        }
        else if(S[i]=='('){
            stk.push('(');
        }        
        else if(S[i]==')'){
            while(!stk.empty() && stk.top()!='('){
                final+=stk.top();
                stk.pop();
            }
            if(!stk.empty()){
                stk.pop();
            }
        }        
        else{
            while(!stk.empty() && CheckPrec(stk.top())>=CheckPrec(S[i])){
                final+=stk.top();
                stk.pop();
            }
            stk.push(S[i]);
        }
    }
    while(!stk.empty()){
        final+=stk.top();
        stk.pop();
    }
    return final;
}

int main() {
    string s="(a+b-c)";
    string a=InfixTOpostfix(s);
    cout<<"a is "<<a;
  
    return 0;
}
