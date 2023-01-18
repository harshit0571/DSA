// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int sum_digits(int a){
    if(a<=0){
        return 0;
    }
    int d=a%10;
    return d+sum_digits(a/10);
    
}
int main() {
    cout<<sum_digits(153);
    return 0;
}
