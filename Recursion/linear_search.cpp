// Online C++ compiler to run C++ program online
#include <iostream>
#include <bits/stdc++.h>
using namespace std;


bool linear(vector<int> ans, int index, int e){
    if(index==ans.size()-1){
        return 0;
    }
    return ans[index]==e || linear(ans, index+1,e);
}
int main() {
    vector<int> arr={1,2,3,4,7,6};
    cout<<sorted(arr, 0, 3);
    return 0;
}
