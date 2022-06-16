#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int check(int n)
{
    int count = 0;
    if (!(n & (n - 1)))
    {
        while (n > 1)
        {
            n >>= 1;
            count++;
        }
    }
    else
    {
        count = 3;
    }
    return count;
}
int main()
{
    int x;
    cin >> x;
    int count = check(x);
    if (count % 2 == 0)
    {
        cout << "exponential of four" << count;
    }
    else
    {
        cout << "not " << count;
    }
}

// //Time Complexity: O(log4n)

// Auxiliary Space: O(1)

// //