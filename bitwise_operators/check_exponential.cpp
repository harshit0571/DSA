#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x;
    cin >> x;
    int flag = x & (x - 1);
    if (!flag)
    {
        cout << "exponential of 2";
    }
    else
    {
        cout << "not";
    }
}

// find exponentials of two
