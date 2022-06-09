// https://www.geeksforgeeks.org/add-1-to-a-given-number/

#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x;
    cin >> x;
    int temp = x & 1;
    if (!temp)
    {
        x = x | 1; // for even
    }
    else
    {
        x = (x >> 1) | 1; // for odd
    }
    cout << x;
}