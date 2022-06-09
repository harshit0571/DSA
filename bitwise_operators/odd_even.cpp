#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
void check(int x)
{
    int temp = x & 1;
    if (temp)
    {
        cout << "x is odd";
    }
    else
    {
        cout << "x is even";
    }
}
int main()
{
    int x;
    cin >> x;
    check(x);
}