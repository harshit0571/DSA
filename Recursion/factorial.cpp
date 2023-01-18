// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;


int recursion(int a){
    if(a==1){
        return 1;
    }
    else{
        return a*recursion(a-1);
    }
}
int main() {
    cout<<recursion(3);
    return 0;
}
