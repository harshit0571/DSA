// Online C++ compiler to run C++ program online
#include <iostream>
#include <bits/stdc++.h>
using namespace std;


bool sorted(vector<int> ans, int index){
    if(index==ans.size()-1){
        return 1;
    }
    return ans[index]<ans[index+1] && sorted(ans, index+1);
}
int main() {
    vector<int> arr={1,2,3,4,7,6};
    cout<<sorted(arr, 0);
    return 0;
}
