#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x, y;
    cin >> x >> y;
    if ((x ^ y) < 0)
    {
        cout << "opposite sign";
    }
    else
    {
        cout << "same sign";
    }
}