// #include <iostream>
// #include <vector>
// #include <bits/stdc++.h>
// using namespace std;
// int bit(int &x)
// {
//     int i = 0;
//     int temp;
//     while (true)
//     {
//         temp = x & 1;
//         if (temp)
//         {
//             return i;
//         }
//         else
//         {
//             x = x >> 1;
//             i++;
//         }
//     }
// }
// int main()
// {
//     int x;
//     cin >> x;
//     int *ptr = &x;
//     int count = bit(x);
//     x = (x) ^ (1 << count);
//     cout << x;
// }

#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int RightMost(int x)
{
    int temp = (x) & (x - 1);
    return temp;
}

int main()
{
    int x;
    cin >> x;
    cout << RightMost(x);
}