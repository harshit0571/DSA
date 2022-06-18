#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
void print_arr(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}
void swap_alternatives(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        if (i + 1 < size)
        {
            swap(arr[i], arr[i + 1]);
            i = i + 1;
        }
    }
}
int main()
{
    int odd[5] = {1, 2, 3, 4, 5};
    int even[8] = {1, 2, 3, 4, 5, 6, 7, 8};
    swap_alternatives(odd, 5);
    print_arr(odd, 5);
}