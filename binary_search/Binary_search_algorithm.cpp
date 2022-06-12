#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
void binary_search(int arr[], int x)
{
    int upper = 5, lower = 0, mid;
    while (upper > lower)
    {
        mid = lower + (upper - lower) / 2;
        if (arr[mid] == x)
        {
            cout << "present";
            return;
        }
        else if (x > arr[mid])
        {
            lower = mid + 1;
        }
        else
        {
            upper = mid - 1;
        }
    }
    cout << "not present";
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    binary_search(arr, 1);
}