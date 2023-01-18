#include <iostream>
using namespace std;
void reverse(int a, int &sum){
    if(a<=0){
        return;
    }
    int rem=a%10;
    sum=sum*10+rem;
    reverse(a/10, sum);
   
}
int main() {
    int sum=0;
    reverse(641, sum);
    cout<<sum;
    return 0;
}
