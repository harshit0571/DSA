#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 5, 2, 1, 4};
    int temp = 0;
    for (int i = 0; i < 9; i++)
    {
        temp = temp ^ arr[i];
    }
    cout << temp;
}