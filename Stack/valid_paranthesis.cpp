#include <bits/stdc++.h>
using namespace std;
 
// Recursive function to print stack elements
// from bottom to top without changing
// their order
void check(string s)
{
    stack<char> stk;
    bool flag=1;
    for(int i=0;i<s.length();i++){
        if(s[i]=='(' || s[i]=='{' || s[i]=='['){
            stk.push(s[i]);     
       
        }
        else if(s[i]==')'){
            if(stk.top()=='('){
                stk.pop();
            }
            else{
                flag=0;
            }
        }
        else if(s[i]==']'){
            if(stk.top()=='['){
                stk.pop();
            }
            else{
                flag=0;
            }
        }
        else if(s[i]=='}'){
            if(stk.top()=='{'){
                stk.pop();
            }
            else{
                flag=0;
            }
        }
    }
    if(stk.empty()==0){
        flag=0;
    }
    cout<<flag;
}
 
// Driver code
int main()
{
    string s="[(())";
    check(s);
    
}
