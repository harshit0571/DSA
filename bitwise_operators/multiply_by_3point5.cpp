#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    // we can get 3.5x by adding 2x+x+x/2;
    int x;
    cin >> x;
    int temp = (x << 1) + (x) + (x >> 1);
    cout << temp;
}