#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int bit = 82;
    // 82 is 1010010, find 4th bit
    int x = 1 << 3;
    int temp = bit & x;
    cout << temp;
}