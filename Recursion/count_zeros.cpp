// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
void count_zeros(int a, int &count){
    if(a<=0){
        return;
    }
    int rem=a%10;
    if(rem==0){
        count++;
    }
    count_zeros(a/10, count);
}
int main() {
    int count=0;
    count_zeros(10, count);
    cout<<count;
    
    return 0;
}
