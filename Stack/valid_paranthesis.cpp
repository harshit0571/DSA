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











//java solution

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '['  || s.charAt(i) == '{' ){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(!st.empty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(!st.empty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(!st.empty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
