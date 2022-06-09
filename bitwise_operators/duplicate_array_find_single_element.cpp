#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[] = {1, 2, 5, 5, 1, 2, 3};
    int temp = arr[0];
    for (int i = 1; i < 7; i++)
    {
        temp = temp ^ arr[i];
    }
    cout << temp;
}

// time complexity O(n) space complexity constant