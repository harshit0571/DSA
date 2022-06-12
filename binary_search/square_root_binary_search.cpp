#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
void find_square_root(int x)
{
    int lower = 0, upper = x;
    int mid;
    while (upper >= lower)
    {
        mid = lower + (upper - lower) / 2;
        if (mid * mid == x)
        {
            cout << mid;
            return;
        }
        else if (mid * mid > x)
        {
            upper = mid - 1;
        }
        else
        {
            lower = mid + 1;
        }
    }
}
int main()
{
    int x;
    cin >> x;
    find_square_root(x);
}